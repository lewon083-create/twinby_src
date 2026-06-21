package w5;

import java.util.regex.Pattern;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f35125c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f35126d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f35127a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f35128b = new StringBuilder();

    public static String a(p pVar, StringBuilder sb2) {
        boolean z5 = false;
        sb2.setLength(0);
        int i = pVar.f28590b;
        int i10 = pVar.f28591c;
        while (i < i10 && !z5) {
            char c8 = (char) pVar.f28589a[i];
            if ((c8 < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && !((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_'))) {
                z5 = true;
            } else {
                i++;
                sb2.append(c8);
            }
        }
        pVar.N(i - pVar.f28590b);
        return sb2.toString();
    }

    public static String b(p pVar, StringBuilder sb2) {
        c(pVar);
        if (pVar.a() == 0) {
            return null;
        }
        String strA = a(pVar, sb2);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) pVar.z());
    }

    public static void c(p pVar) {
        while (true) {
            for (boolean z5 = true; pVar.a() > 0 && z5; z5 = false) {
                int i = pVar.f28590b;
                byte[] bArr = pVar.f28589a;
                byte b2 = bArr[i];
                char c8 = (char) b2;
                if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                    pVar.N(1);
                } else {
                    int i10 = pVar.f28591c;
                    int i11 = i + 2;
                    if (i11 <= i10) {
                        int i12 = i + 1;
                        if (b2 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                }
                                if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            pVar.N(i10 - pVar.f28590b);
                        }
                    }
                }
            }
            return;
        }
    }
}
