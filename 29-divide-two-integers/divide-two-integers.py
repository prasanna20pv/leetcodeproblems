class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        sign = (dividend < 0) == (divisor < 0)
        print(sign)
        dividend = abs(dividend)
        divisor = abs(divisor)

        res = 0
        while dividend >= divisor:
            # KEY CHANGES:
            curr_divisor = divisor
            num_divisor = 1
            while dividend >= curr_divisor:
                dividend -= curr_divisor
                res += num_divisor

                curr_divisor = curr_divisor << 1
                num_divisor = num_divisor << 1
        
        if not sign:
            res = -res

        MIN = -2147483648
        MAX = 2147483647
        return min(MAX, max(MIN, res))