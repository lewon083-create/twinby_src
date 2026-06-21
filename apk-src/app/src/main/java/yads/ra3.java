package yads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ra3 {
    public static int[] a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String a(StringBuilder sb2, int i, int i10) {
        int i11;
        int iLastIndexOf;
        if (i >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i) == '/') {
            i++;
        }
        int i12 = i;
        int i13 = i12;
        while (i12 <= i10) {
            if (i12 == i10) {
                i11 = i12;
            } else if (sb2.charAt(i12) == '/') {
                i11 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb2.charAt(i13) == '.') {
                sb2.delete(i13, i11);
                i10 -= i11 - i13;
            } else {
                if (i12 == i13 + 2 && sb2.charAt(i13) == '.' && sb2.charAt(i14) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i13 - 2) + 1;
                    int i15 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb2.delete(i15, i11);
                    i10 -= i11 - i15;
                } else {
                    iLastIndexOf = i12 + 1;
                }
                i13 = iLastIndexOf;
            }
            i12 = i13;
        }
        return sb2.toString();
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrA = a(str2);
        if (iArrA[0] != -1) {
            sb2.append(str2);
            a(sb2, iArrA[1], iArrA[2]);
            return sb2.toString();
        }
        int[] iArrA2 = a(str);
        if (iArrA[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrA2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrA[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrA2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i = iArrA[1];
        if (i != 0) {
            int i10 = iArrA2[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return a(sb2, iArrA[1] + i10, i10 + iArrA[2]);
        }
        if (str2.charAt(i) == '/') {
            sb2.append((CharSequence) str, 0, iArrA2[1]);
            sb2.append(str2);
            int i11 = iArrA2[1];
            return a(sb2, i11, iArrA[2] + i11);
        }
        int i12 = iArrA2[0] + 2;
        int i13 = iArrA2[1];
        if (i12 < i13 && i13 == iArrA2[2]) {
            sb2.append((CharSequence) str, 0, i13);
            sb2.append('/');
            sb2.append(str2);
            int i14 = iArrA2[1];
            return a(sb2, i14, iArrA[2] + i14 + 1);
        }
        int iLastIndexOf = str.lastIndexOf(47, iArrA2[2] - 1);
        int i15 = iLastIndexOf == -1 ? iArrA2[1] : iLastIndexOf + 1;
        sb2.append((CharSequence) str, 0, i15);
        sb2.append(str2);
        return a(sb2, iArrA2[1], i15 + iArrA[2]);
    }
}
