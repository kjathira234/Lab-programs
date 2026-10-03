#!/bin/bash
read -p "enter a year: " year
if (( year % 400 == 0 )); then
echo "$year is a leap year"
elif (( year %  100 == 0 )); then
echo "$year is NOT a leap year"
elif (( year % 4 == 0)); then
echo "$year is a leap year"
else 
echo "$year is NOT a leap year"
fi
