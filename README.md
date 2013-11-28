java-crc16citt
==============

A class for calculating CRC16CITT checksum for byte arrays

usage: 
------

```Java
byte[] array = new byte[] {1,2,3,4,5};
CRC16CCITT calc = new CRC16CCITT();
for (byte b : array)
  calc.update(b);
calc.value(); // current checksum
```
