#!/bin/bash
calculate()
{
first_num=$num1
operator=$op
second_num=$num2
operator=$op
case $operator in
+)result=$((first_num + $second_num)) ;;
-)result=$(($first_num - $second_num)) ;;
\*)result=$((first_num * $second_num)) ;;
/)result=$((first_num / second_num)) ;;
%)result=$((first_num % second_num)) ;;
*)echo "Invalid operation"; exit 1 ;;
esac
echo "result:$result"
}
echo "enter first number:"
read num1
echo "enter an operator(+,-,*,/,%):"
read op
echo "enter second number:"
read num2
calculate $num $op $num2
4455
IN


