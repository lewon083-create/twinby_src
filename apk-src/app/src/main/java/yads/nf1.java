package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nf1 implements vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r51 f41245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41246b;

    public nf1(int i, um2 um2Var) {
        this.f41246b = i;
        this.f41245a = um2Var;
    }

    public final vl a(Class cls) {
        o51 o51VarListIterator = this.f41245a.listIterator(0);
        while (o51VarListIterator.hasNext()) {
            vl vlVar = (vl) o51VarListIterator.next();
            if (vlVar.getClass() == cls) {
                return vlVar;
            }
        }
        return null;
    }

    @Override // yads.vl
    public final int getType() {
        return this.f41246b;
    }

    public static nf1 a(int i, lb2 lb2Var) {
        String str;
        vl w33Var;
        String str2;
        String str3;
        int i10 = 4;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = lb2Var.f40465c;
        int i12 = 0;
        int i13 = -2;
        int i14 = 0;
        while (lb2Var.f40465c - lb2Var.f40464b > 8) {
            int iD = lb2Var.d();
            int iD2 = lb2Var.f40464b + lb2Var.d();
            lb2Var.d(iD2);
            if (iD == 1414744396) {
                w33Var = a(lb2Var.d(), lb2Var);
            } else {
                vl zlVar = null;
                if (iD != 1718776947) {
                    if (iD == 1751742049) {
                        int iD3 = lb2Var.d();
                        lb2Var.e(lb2Var.f40464b + 8);
                        int iD4 = lb2Var.d();
                        int iD5 = lb2Var.d();
                        lb2Var.e(lb2Var.f40464b + i10);
                        lb2Var.d();
                        lb2Var.e(lb2Var.f40464b + 12);
                        zlVar = new zl(iD3, iD4, iD5);
                    } else if (iD == 1752331379) {
                        int iD6 = lb2Var.d();
                        lb2Var.e(lb2Var.f40464b + 12);
                        lb2Var.d();
                        int iD7 = lb2Var.d();
                        int iD8 = lb2Var.d();
                        lb2Var.e(lb2Var.f40464b + i10);
                        int iD9 = lb2Var.d();
                        int iD10 = lb2Var.d();
                        lb2Var.e(lb2Var.f40464b + 8);
                        zlVar = new am(iD6, iD7, iD8, iD9, iD10);
                    } else if (iD == 1852994675) {
                        w33Var = new z33(lb2Var.a(lb2Var.f40465c - lb2Var.f40464b, bu.f37146c));
                    }
                    w33Var = zlVar;
                } else if (i13 == 2) {
                    lb2Var.e(lb2Var.f40464b + i10);
                    int iD11 = lb2Var.d();
                    int iD12 = lb2Var.d();
                    lb2Var.e(lb2Var.f40464b + i10);
                    int iD13 = lb2Var.d();
                    switch (iD13) {
                        case 808802372:
                        case 877677894:
                        case 1145656883:
                        case 1145656920:
                        case 1482049860:
                        case 1684633208:
                        case 2021026148:
                            str2 = "video/mp4v-es";
                            str3 = str2;
                            break;
                        case 826496577:
                        case 828601953:
                        case 875967048:
                            str2 = "video/avc";
                            str3 = str2;
                            break;
                        case 842289229:
                            str2 = "video/mp42";
                            str3 = str2;
                            break;
                        case 859066445:
                            str2 = "video/mp43";
                            str3 = str2;
                            break;
                        case 1196444237:
                        case 1735420525:
                            str2 = "video/mjpeg";
                            str3 = str2;
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                    if (str3 == null) {
                        mf1.a("Ignoring track with unsupported compression ", iD13, "StreamFormatChunk");
                        w33Var = zlVar;
                    } else {
                        mx0 mx0Var = new mx0();
                        mx0Var.f41080p = iD11;
                        mx0Var.f41081q = iD12;
                        mx0Var.f41075k = str3;
                        w33Var = new w33(new nx0(mx0Var));
                    }
                } else {
                    if (i13 == 1) {
                        int iH = lb2Var.h();
                        if (iH == 1) {
                            str = "audio/raw";
                        } else if (iH == 85) {
                            str = "audio/mpeg";
                        } else if (iH == 255) {
                            str = "audio/mp4a-latm";
                        } else if (iH != 8192) {
                            str = iH != 8193 ? null : "audio/vnd.dts";
                        } else {
                            str = "audio/ac3";
                        }
                        if (str == null) {
                            mf1.a("Ignoring track with unsupported format tag ", iH, "StreamFormatChunk");
                        } else {
                            int iH2 = lb2Var.h();
                            int iD14 = lb2Var.d();
                            lb2Var.e(lb2Var.f40464b + 6);
                            int iB = lb3.b(lb2Var.r());
                            int iH3 = lb2Var.h();
                            byte[] bArr = new byte[iH3];
                            lb2Var.a(bArr, i12, iH3);
                            mx0 mx0Var2 = new mx0();
                            mx0Var2.f41075k = str;
                            mx0Var2.f41088x = iH2;
                            mx0Var2.f41089y = iD14;
                            if ("audio/raw".equals(str) && iB != 0) {
                                mx0Var2.f41090z = iB;
                            }
                            if ("audio/mp4a-latm".equals(str) && iH3 > 0) {
                                mx0Var2.f41077m = r51.a(bArr);
                            }
                            w33Var = new w33(new nx0(mx0Var2));
                        }
                    } else {
                        kh1.d("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + lb3.d(i13));
                    }
                    w33Var = zlVar;
                }
            }
            if (w33Var != null) {
                if (w33Var.getType() == 1752331379) {
                    am amVar = (am) w33Var;
                    int i15 = amVar.f36766a;
                    if (i15 == 1935960438) {
                        i13 = 2;
                    } else if (i15 == 1935963489) {
                        i13 = 1;
                    } else if (i15 != 1937012852) {
                        kh1.d("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(amVar.f36766a));
                        i13 = -1;
                    } else {
                        i13 = 3;
                    }
                }
                int i16 = i14 + 1;
                if (objArrCopyOf.length < i16) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, k51.a(objArrCopyOf.length, i16));
                }
                objArrCopyOf[i14] = w33Var;
                i14 = i16;
            }
            lb2Var.e(iD2);
            lb2Var.d(i11);
            i10 = 4;
            i12 = 0;
        }
        return new nf1(i, r51.b(i14, objArrCopyOf));
    }
}
