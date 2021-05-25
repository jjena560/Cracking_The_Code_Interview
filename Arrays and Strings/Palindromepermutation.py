def palindromePermutation(str):
    hash = [0]*128
    for i in range(len(str)):
        val = ord(str[i])
        hash[val] += 1

    oddCount = countOdd(hash)

    if oddCount > 1:
        return 'NO'
    else:
        return 'YES'


def countOdd(hash):
    count = 0
    for i in range(len(hash)):
        if hash[i] % 2 == 1:
            count += 1

    return count


str = 'poopi'
print(palindromePermutation(str))


# function to check string is
# palindrome or not
def isPalindrome(str):

    # Run loop from 0 to len/2
    for i in range(0, int(len(str)/2)):
        if str[i] != str[len(str)-i-1]:
            return False
    return True


# main function
s = "malayalam"
ans = isPalindrome(s)

if (ans):
    print("Yes")
else:
    print("No")
