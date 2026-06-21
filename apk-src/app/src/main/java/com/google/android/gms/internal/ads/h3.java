package com.google.android.gms.internal.ads;

import io.sentry.MeasurementUnit;
import io.sentry.rrweb.RRWebVideoEvent;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x41 f6011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6012b;

    public h3(int i, r51 r51Var) {
        this.f6012b = i;
        this.f6011a = r51Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static h3 a(int i, tk0 tk0Var) {
        String str;
        b3 i3Var;
        String str2;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = tk0Var.f10643c;
        int iA = -2;
        int i11 = 0;
        while (tk0Var.B() > 8) {
            int iC = tk0Var.c();
            int iC2 = tk0Var.f10642b + tk0Var.c();
            tk0Var.C(iC2);
            if (iC != 1414744396) {
                f3 f3Var = null;
                switch (iC) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iM = tk0Var.M();
                                String str3 = iM != 1 ? iM != 85 ? iM != 255 ? iM != 8192 ? iM != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int iM2 = tk0Var.M();
                                    int iC3 = tk0Var.c();
                                    tk0Var.G(6);
                                    int iY = cq0.y(tk0Var.M(), ByteOrder.LITTLE_ENDIAN);
                                    int iM3 = tk0Var.B() > 0 ? tk0Var.M() : 0;
                                    ow1 ow1Var = new ow1();
                                    ow1Var.e(str3);
                                    ow1Var.D = iM2;
                                    ow1Var.E = iC3;
                                    if (str3.equals("audio/raw") && iY != 0) {
                                        ow1Var.F = iY;
                                    }
                                    if (str3.equals("audio/mp4a-latm") && iM3 > 0) {
                                        byte[] bArr = new byte[iM3];
                                        tk0Var.H(bArr, 0, iM3);
                                        ow1Var.f8835o = x41.q(bArr);
                                    }
                                    i3Var = new i3(new jx1(ow1Var));
                                } else {
                                    a0.u.t(new StringBuilder(String.valueOf(iM).length() + 43), "Ignoring track with unsupported format tag ", iM, "StreamFormatChunk");
                                }
                            } else {
                                String str4 = cq0.f4293a;
                                switch (iA) {
                                    case -2:
                                        str = MeasurementUnit.NONE;
                                        break;
                                    case -1:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = RRWebVideoEvent.EVENT_TAG;
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                rs.r("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            i3Var = f3Var;
                            break;
                        } else {
                            tk0Var.G(4);
                            int iC4 = tk0Var.c();
                            int iC5 = tk0Var.c();
                            tk0Var.G(4);
                            int iC6 = tk0Var.c();
                            switch (iC6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                ow1 ow1Var2 = new ow1();
                                ow1Var2.f8839s = iC4;
                                ow1Var2.f8840t = iC5;
                                ow1Var2.e(str2);
                                i3Var = new i3(new jx1(ow1Var2));
                            } else {
                                a0.u.t(new StringBuilder(String.valueOf(iC6).length() + 44), "Ignoring track with unsupported compression ", iC6, "StreamFormatChunk");
                                i3Var = f3Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iC7 = tk0Var.c();
                        tk0Var.G(8);
                        int iC8 = tk0Var.c();
                        int iC9 = tk0Var.c();
                        tk0Var.G(4);
                        tk0Var.c();
                        tk0Var.G(12);
                        i3Var = new e3(iC7, iC8, iC9);
                        break;
                    case 1752331379:
                        int iC10 = tk0Var.c();
                        tk0Var.G(12);
                        tk0Var.c();
                        int iC11 = tk0Var.c();
                        int iC12 = tk0Var.c();
                        tk0Var.G(4);
                        int iC13 = tk0Var.c();
                        int iC14 = tk0Var.c();
                        tk0Var.G(4);
                        f3Var = new f3(iC10, iC11, iC12, iC13, iC14, tk0Var.c());
                        i3Var = f3Var;
                        break;
                    case 1852994675:
                        i3Var = new j3(tk0Var.k(tk0Var.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        i3Var = f3Var;
                        break;
                }
            } else {
                i3Var = a(tk0Var.c(), tk0Var);
            }
            if (i3Var != null) {
                if (i3Var.h() == 1752331379) {
                    iA = ((f3) i3Var).a();
                }
                int length = objArrCopyOf.length;
                int i12 = i11 + 1;
                int iD = s41.d(length, i12);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i11] = i3Var;
                i11 = i12;
            }
            tk0Var.E(iC2);
            tk0Var.C(i10);
        }
        return new h3(i, x41.x(i11, objArrCopyOf));
    }

    public final b3 b(Class cls) {
        x41 x41Var = this.f6011a;
        int size = x41Var.size();
        int i = 0;
        while (i < size) {
            b3 b3Var = (b3) x41Var.get(i);
            i++;
            if (b3Var.getClass() == cls) {
                return b3Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final int h() {
        return this.f6012b;
    }
}
