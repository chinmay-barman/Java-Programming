received = input("Enter the receieved data: ");
received = list(received);
received = received[::-1];
m = len(received);
r = 1;
while(2**r<m+1):
    r+=1;
sum = 0;
for i in range(r):
    pos = 2**i;
    count = 0;
    for j in range(1,m+1):
        if j&pos and received[j-1]=='1':
            count+=1;
    if(count%2!=0):
        sum+=pos;

if sum==0:
    print("No error found.");
else:
    print("Error at position: "+str(sum));
    if(received[sum-1]=='0'):
        received[sum-1] = '1';
    else:
        received[sum-1] = '0';

received = "".join(received[::-1]);
print("Corrected data is: "+received);