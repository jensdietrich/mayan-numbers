# Arabic to Mayan Number Conversion

The converter takes a non-negative ints as inputs, and produces a Mayan number using the following textual notation: 

1. instead of top-down, numbers are written left-to-right
2. digits (= numbers up to 20 exclusive, as Mayan numerals use a  vigesimal, base-20 system) are separated by `_`
3. zero is represented by `0`
4. a dot is represented by `*`
5. a bar is represented by `|` (since numbers are rotated clockwise 90 degrees, the horizontal bar is not vertical)

### Examples

| Arabic Number      | Mayan Number |
| ----------- | ----------- |
| 0   | `0`       |
| 1   | `*`       |
| 2   | `**`       |
| 3   | `***`      |
| 4   | `****`       |
| 5   | `|`       |
| 6   | `*|`       |
| 7   | `**|`       |
| 8   | `***|`       |
| 9   | `****|`       |
| 10  | `||`       |
| 11  | `*||`       |
| 12  | `**||`       |
| 20  | `*_0`       |
| 21  | `*_*`       |

For more examples, check test cases. Also check the [online converter](https://math.tools/numbers/to-mayan/1) that can convert arabic numbers to the graphical representation of mayan numbers.  


