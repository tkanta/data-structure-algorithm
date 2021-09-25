import array

class ArrayOps:
    def arrayItr(self):
        arr = array.array('i', [1,2,3])
        print("Tne new array :", end=" ")
        arr.append(4)
        arr.insert(2,5)
        for i in range(0,5):
            print(arr[i], end=" ")



if __name__ == '__main__':
    arrOps = ArrayOps()
    arrOps.arrayItr()