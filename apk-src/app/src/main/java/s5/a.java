package s5;

import ad.j0;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.b;
import m3.g;
import m3.p;
import n5.l;
import n5.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f32774e = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f32775f = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f32776b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f32777c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f32778d = new p();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l3.b a(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.a(android.text.Spanned, java.lang.String):l3.b");
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    @Override // n5.m
    public final void p(byte[] bArr, int i, int i10, l lVar, g gVar) {
        String strN;
        String str;
        a aVar = this;
        long j10 = lVar.f29125a;
        p pVar = aVar.f32778d;
        pVar.K(i + i10, bArr);
        pVar.M(i);
        Charset charsetI = pVar.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (j10 == -9223372036854775807L || !lVar.f29126b) ? null : new ArrayList();
        while (true) {
            String strN2 = pVar.n(charsetI);
            if (strN2 == null) {
                break;
            }
            if (!strN2.isEmpty()) {
                try {
                    Integer.parseInt(strN2);
                    strN = pVar.n(charsetI);
                } catch (NumberFormatException unused) {
                    b.s("SubripParser", "Skipping invalid index: ".concat(strN2));
                }
                if (strN == null) {
                    b.s("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f32774e.matcher(strN);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb2 = aVar.f32776b;
                    long j12 = j11;
                    sb2.setLength(0);
                    ArrayList arrayList2 = aVar.f32777c;
                    arrayList2.clear();
                    for (String strN3 = pVar.n(charsetI); !TextUtils.isEmpty(strN3); strN3 = pVar.n(charsetI)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String strTrim = strN3.trim();
                        StringBuilder sb3 = new StringBuilder(strTrim);
                        Matcher matcher2 = f32775f.matcher(strTrim);
                        int i11 = 0;
                        while (matcher2.find()) {
                            Matcher matcher3 = matcher2;
                            String strGroup = matcher3.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher3.start() - i11;
                            int length = strGroup.length();
                            sb3.replace(iStart, iStart + length, "");
                            i11 += length;
                            matcher2 = matcher3;
                            j10 = j10;
                        }
                        sb2.append(sb3.toString());
                    }
                    long j13 = j10;
                    Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (j13 == j12 || jB2 >= j13) {
                        gVar.accept(new n5.a(jB, jB2 - jB, j0.w(a(spannedFromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new n5.a(jB, jB2 - jB, j0.w(a(spannedFromHtml, str))));
                    }
                    aVar = this;
                    j11 = j12;
                    j10 = j13;
                } else {
                    b.s("SubripParser", "Skipping invalid timing: ".concat(strN));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.accept((n5.a) it.next());
            }
        }
    }

    @Override // n5.m
    public final int s() {
        return 1;
    }
}
