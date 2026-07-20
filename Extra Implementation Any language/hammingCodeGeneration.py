data = input("Enter the data for transmission: ");
m = len(data);
r = 1;
while(2**r<m+r+1):
    r+=1;
h = ['0']*(m+r);

j = 0;
for i in range(1,m+r+1):
    if(2**j==i):
        j+=1;
    else:
        h[i-1] = data[-1];
        data = data[:-1];

for i in range(r):
    pos = 2**i;
    count = 0;
    for j in range(1,m+r+1):
        if j&pos and h[j-1]=='1':
            count+=1;
    if(count%2!=0):
        h[pos-1] = '1';
hamming = "".join(h[::-1]);

print("Generated hamming code is: "+hamming);