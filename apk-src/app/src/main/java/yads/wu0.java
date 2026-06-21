package yads;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wu0 {
    /* JADX WARN: Can't wrap try/catch for region: R(45:0|2|(2:166|3)|6|(4:8|(1:16)(1:15)|17|(1:22))|23|(1:28)|29|(4:31|(1:39)(1:38)|40|(1:45))|46|180|47|(2:49|(1:54)(1:52))(0)|55|(2:164|56)|(1:58)(1:60)|61|176|62|(1:64)(1:66)|67|174|68|(42:71|(1:73)|74|(4:76|(3:78|(2:80|199)(2:81|198)|82)|197|83)|86|(1:88)(1:89)|90|172|91|94|170|95|98|168|99|(1:101)|102|(1:104)(1:105)|106|(1:108)(1:109)|110|(1:112)(1:113)|114|348|118|(1:120)|121|(1:123)(1:124)|(1:126)|127|(1:129)|130|(3:133|(4:184|138|(2:139|(1:IC)(2:141|(3:185|143|189)(1:190)))|186)(2:187|186)|131)|182|144|(4:147|(3:192|149|195)(1:194)|193|145)|191|150|(2:153|151)|196|154|155)(1:70)|85|86|(0)(0)|90|172|91|94|170|95|98|168|99|(0)|102|(0)(0)|106|(0)(0)|110|(0)(0)|114|348) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ea, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.vu0 a(android.content.Context r16, yads.rx2 r17, yads.qx r18, yads.up2 r19, yads.ra2 r20) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wu0.a(android.content.Context, yads.rx2, yads.qx, yads.up2, yads.ra2):yads.vu0");
    }

    public static vu0 a(Context context, d4 d4Var, rx2 rx2Var) {
        String str;
        String string;
        String strDecode;
        String strDecode2;
        vu0 vu0VarA = a(context, rx2Var, d4Var.f37614b, new up2(), new ra2(wg1.a(context)));
        g9 g9Var = d4Var.f37617e;
        if (g9Var != null) {
            vu0VarA.J = vu0VarA.f44125a ? null : g9Var;
            String str2 = g9Var.f38679d;
            if (str2 == null || str2.length() == 0) {
                strDecode = null;
            } else {
                String strEncode = Uri.encode(str2);
                if (strEncode != null && strEncode.length() > 1024) {
                    hl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                    String strEncode2 = Uri.encode(" ");
                    String strSubstring = strEncode.substring(0, 1024);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    boolean zM = kotlin.text.a0.m(1024, strEncode, strEncode2, false);
                    int iE = StringsKt.E(6, strSubstring, strEncode2);
                    if (zM || iE < 0) {
                        strEncode = strSubstring;
                    } else {
                        strEncode = strSubstring.substring(0, iE);
                        Intrinsics.checkNotNullExpressionValue(strEncode, "substring(...)");
                    }
                }
                strDecode = Uri.decode(strEncode);
            }
            vu0VarA.U = strDecode;
            List<String> list = g9Var.f38680e;
            String string2 = "";
            if (list != null) {
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : list) {
                    sb2.append(string2);
                    sb2.append(str3);
                    sb2.append("\n");
                    string2 = "3";
                }
                string2 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            }
            if (string2.length() == 0) {
                strDecode2 = null;
            } else {
                String strEncode3 = Uri.encode(string2);
                if (strEncode3 != null && strEncode3.length() > 2048) {
                    hl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                    String strEncode4 = Uri.encode("\n");
                    strEncode3 = strEncode3.substring(0, 2048);
                    Intrinsics.checkNotNullExpressionValue(strEncode3, "substring(...)");
                    int iE2 = StringsKt.E(6, strEncode3, strEncode4);
                    if (!kotlin.text.a0.h(strEncode3, strEncode4) && iE2 >= 0) {
                        strEncode3 = strEncode3.substring(0, iE2);
                        Intrinsics.checkNotNullExpressionValue(strEncode3, "substring(...)");
                    }
                }
                strDecode2 = Uri.decode(strEncode3);
            }
            vu0VarA.V = strDecode2;
            vu0VarA.f44171y0 = m9.a(g9Var.f38677b);
            vu0VarA.f44173z0 = m9.a(g9Var.f38678c);
            vu0VarA.f44128b0 = g9Var.f38683h;
            ip2 ip2Var = g9Var.f38684j;
            if (ip2Var != null) {
                vu0VarA.D0 = m9.a(ip2Var.f39608b);
            }
            HashMap mapA = m9.a(g9Var.f38682g);
            if (mapA != null) {
                vu0VarA.f44139h.putAll(mapA);
            }
        }
        e00 e00Var = d4Var.f37613a;
        if (e00Var != null) {
            vu0VarA.f44166w = e00Var.f37950b;
        }
        vu0VarA.f44149n = d4Var.f37621j;
        vu0VarA.f44164v = d4Var.f37615c.f39118a;
        x42 x42Var = d4Var.f37618f;
        if (x42Var != null) {
            vu0VarA.X = x42Var.f44602b;
        }
        d03 d03Var = d4Var.f37616d.f37951a;
        if (d03Var != null) {
            vu0VarA.f44172z = d03Var.b().f37246b;
            vu0VarA.f44168x = Integer.valueOf(d03Var.c(context));
            vu0VarA.f44170y = Integer.valueOf(d03Var.a(context));
        }
        vu0VarA.f44130c0 = d4Var.f37620h;
        vu0VarA.f44132d0 = d4Var.i;
        int i = d4Var.f37625n;
        if (1 == i) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        vu0VarA.A = str;
        String str4 = d4Var.f37615c.f39118a;
        if (str4 != null && (string = ry2.a(new ry2(), context, "ViewSizeInfoStorage").getString(hl3.a(new il3(i, str4)), null)) != null) {
            vu0VarA.F0 = string;
        }
        return vu0VarA;
    }
}
