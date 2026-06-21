package s4;

import ad.b1;
import ad.e0;
import ad.h0;
import ad.j0;
import ad.q;
import j3.c0;
import j3.n;
import j3.o;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m3.p;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f32770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32771b;

    public f(int i, b1 b1Var) {
        this.f32771b = i;
        this.f32770a = b1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i, p pVar) {
        a gVar;
        String str;
        int i10 = 4;
        q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = pVar.f28591c;
        int iA = -2;
        int i12 = 0;
        while (pVar.a() > 8) {
            int iO = pVar.o();
            int iO2 = pVar.f28590b + pVar.o();
            pVar.L(iO2);
            if (iO != 1414744396) {
                d dVar = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iS = pVar.s();
                                String str2 = iS != 1 ? iS != 85 ? iS != 255 ? iS != 8192 ? iS != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iS2 = pVar.s();
                                    int iO3 = pVar.o();
                                    pVar.N(6);
                                    int iS3 = pVar.s();
                                    String str3 = z.f28608a;
                                    int iB = z.B(iS3, ByteOrder.LITTLE_ENDIAN);
                                    int iS4 = pVar.a() > 0 ? pVar.s() : 0;
                                    n nVar = new n();
                                    nVar.f26292m = c0.n(str2);
                                    nVar.E = iS2;
                                    nVar.F = iO3;
                                    if (str2.equals("audio/raw") && iB != 0) {
                                        nVar.G = iB;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iS4 > 0) {
                                        byte[] bArr = new byte[iS4];
                                        pVar.k(bArr, 0, iS4);
                                        nVar.f26295p = j0.w(bArr);
                                    }
                                    gVar = new g(new o(nVar));
                                } else {
                                    gf.a.p(iS, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                m3.b.s("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + z.E(iA));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            pVar.N(i10);
                            int iO4 = pVar.o();
                            int iO5 = pVar.o();
                            pVar.N(i10);
                            int iO6 = pVar.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                n nVar2 = new n();
                                nVar2.f26299t = iO4;
                                nVar2.f26300u = iO5;
                                nVar2.f26292m = c0.n(str);
                                gVar = new g(new o(nVar2));
                            } else {
                                gf.a.p(iO6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = pVar.o();
                        pVar.N(8);
                        int iO8 = pVar.o();
                        int iO9 = pVar.o();
                        pVar.N(i10);
                        pVar.o();
                        pVar.N(12);
                        gVar = new c(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = pVar.o();
                        pVar.N(12);
                        pVar.o();
                        int iO11 = pVar.o();
                        int iO12 = pVar.o();
                        pVar.N(i10);
                        int iO13 = pVar.o();
                        int iO14 = pVar.o();
                        pVar.N(i10);
                        dVar = new d(iO10, iO11, iO12, iO13, iO14, pVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(pVar.x(pVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(pVar.o(), pVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    iA = ((d) gVar).a();
                }
                int i13 = i12 + 1;
                int iF = e0.f(objArrCopyOf.length, i13);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i12] = gVar;
                i12 = i13;
            }
            pVar.M(iO2);
            pVar.L(i11);
            i10 = 4;
        }
        return new f(i, j0.p(i12, objArrCopyOf));
    }

    public final a a(Class cls) {
        h0 h0VarListIterator = this.f32770a.listIterator(0);
        while (h0VarListIterator.hasNext()) {
            a aVar = (a) h0VarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // s4.a
    public final int getType() {
        return this.f32771b;
    }
}
