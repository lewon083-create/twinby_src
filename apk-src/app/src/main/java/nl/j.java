package nl;

import com.google.android.gms.internal.ads.om1;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class j implements Serializable, Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f29541e = new j(new byte[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f29542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f29543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient String f29544d;

    public j(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29542b = data;
    }

    public int a() {
        return this.f29542b.length;
    }

    public String b() {
        byte[] bArr = this.f29542b;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i10 = i + 1;
            char[] cArr2 = ol.b.f30750a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i10] = cArr2[b2 & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public byte[] c() {
        return this.f29542b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j other = (j) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int iA = a();
        int iA2 = other.a();
        int iMin = Math.min(iA, iA2);
        for (int i = 0; i < iMin; i++) {
            int iD = d(i) & 255;
            int iD2 = other.d(i) & 255;
            if (iD != iD2) {
                return iD < iD2 ? -1 : 1;
            }
        }
        if (iA == iA2) {
            return 0;
        }
        return iA < iA2 ? -1 : 1;
    }

    public byte d(int i) {
        return this.f29542b[i];
    }

    public boolean e(int i, int i10, int i11, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f29542b;
        return i <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && hl.d.e(i, i10, i11, bArr, other);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iA = jVar.a();
            byte[] bArr = this.f29542b;
            if (iA == bArr.length && jVar.e(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(j other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.e(0, 0, i, this.f29542b);
    }

    public j g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f29542b;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i10 = i + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b10 = bArrCopyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i++;
        }
    }

    public final String h() {
        String str = this.f29544d;
        if (str != null) {
            return str;
        }
        byte[] bArrC = c();
        Intrinsics.checkNotNullParameter(bArrC, "<this>");
        String str2 = new String(bArrC, Charsets.UTF_8);
        this.f29544d = str2;
        return str2;
    }

    public int hashCode() {
        int i = this.f29543c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f29542b);
        this.f29543c = iHashCode;
        return iHashCode;
    }

    public void i(g buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.m623write(this.f29542b, 0, i);
    }

    public String toString() {
        j jVar;
        byte b2;
        int i;
        byte[] bArr = this.f29542b;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                break;
            }
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                int i13 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i11 += b10 < 65536 ? 1 : 2;
                i10++;
                while (true) {
                    i12 = i13;
                    if (i10 < length && (b2 = bArr[i10]) >= 0) {
                        i10++;
                        i13 = i12 + 1;
                        if (i12 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i11 += b2 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i14 = i10 + 1;
                if (length > i14) {
                    byte b11 = bArr[i14];
                    if ((b11 & 192) == 128) {
                        int i15 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i15 >= 128) {
                            i = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                break;
                            }
                            i11 += i15 < 65536 ? 1 : 2;
                            Unit unit = Unit.f27471a;
                            i10 += 2;
                            i12 = i;
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b10 >> 4) == -2) {
                int i16 = i10 + 2;
                if (length > i16) {
                    byte b12 = bArr[i10 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i16];
                        if ((b13 & 192) == 128) {
                            int i17 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i17 < 2048) {
                                if (i12 != 64) {
                                    break;
                                }
                            } else if (55296 > i17 || i17 >= 57344) {
                                i = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    break;
                                }
                                i11 += i17 < 65536 ? 1 : 2;
                                Unit unit2 = Unit.f27471a;
                                i10 += 3;
                                i12 = i;
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b10 >> 3) == -2) {
                int i18 = i10 + 3;
                if (length > i18) {
                    byte b14 = bArr[i10 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i10 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i18];
                            if ((b16 & 192) == 128) {
                                int i19 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i19 > 1114111) {
                                    if (i12 != 64) {
                                        break;
                                    }
                                } else if (55296 > i19 || i19 >= 57344) {
                                    if (i19 >= 65536) {
                                        i = i12 + 1;
                                        if (i12 == 64) {
                                            break;
                                        }
                                        if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                            break;
                                        }
                                        i11 += i19 < 65536 ? 1 : 2;
                                        Unit unit3 = Unit.f27471a;
                                        i10 += 4;
                                        i12 = i;
                                    } else if (i12 != 64) {
                                        break;
                                    }
                                } else if (i12 != 64) {
                                    break;
                                }
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if (i12 != 64) {
                break;
            }
        }
        i11 = -1;
        if (i11 != -1) {
            String strH = h();
            String strSubstring = strH.substring(0, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strL = a0.l(a0.l(a0.l(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i11 >= strH.length()) {
                return pe.a.c(']', "[text=", strL);
            }
            return "[size=" + bArr.length + " text=" + strL + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(om1.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 == bArr.length) {
            jVar = this;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            kotlin.collections.m.a(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
            jVar = new j(bArrCopyOfRange);
        }
        sb2.append(jVar.b());
        sb2.append("…]");
        return sb2.toString();
    }
}
