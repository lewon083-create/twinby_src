package q4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f31755c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31756a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31757b = -1;

    public final boolean a(String str) {
        Matcher matcher = f31755c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = m3.z.f28608a;
            int i = Integer.parseInt(strGroup, 16);
            int i10 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i10 <= 0) {
                return false;
            }
            this.f31756a = i;
            this.f31757b = i10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(j3.b0 r11) {
        /*
            r10 = this;
            r11.getClass()
            ad.g0 r0 = ad.j0.q()
            j3.a0[] r11 = r11.f26216a
            int r1 = r11.length
            r2 = 0
            r3 = r2
        Lc:
            r4 = 0
            java.lang.String r5 = "iTunSMPB"
            if (r3 >= r1) goto L39
            r6 = r11[r3]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<e5.e> r8 = e5.e.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L31
            java.lang.Object r6 = r8.cast(r6)
            j3.a0 r6 = (j3.a0) r6
            r7 = r6
            e5.e r7 = (e5.e) r7
            java.lang.String r7 = r7.f16243c
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L31
            r4 = r6
        L31:
            if (r4 == 0) goto L36
            r0.b(r4)
        L36:
            int r3 = r3 + 1
            goto Lc
        L39:
            ad.b1 r0 = r0.g()
            ad.h0 r0 = r0.listIterator(r2)
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            e5.e r1 = (e5.e) r1
            java.lang.String r1 = r1.f16244d
            boolean r1 = r10.a(r1)
            if (r1 == 0) goto L41
            goto Lb2
        L56:
            ad.g0 r0 = ad.j0.q()
            int r1 = r11.length
            r3 = r2
        L5c:
            if (r3 >= r1) goto L96
            r6 = r11[r3]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<e5.l> r8 = e5.l.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r8.cast(r6)
            j3.a0 r6 = (j3.a0) r6
            r7 = r6
            e5.l r7 = (e5.l) r7
            java.lang.String r8 = r7.f16254b
            java.lang.String r9 = "com.apple.iTunes"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L89
            java.lang.String r7 = r7.f16255c
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L89
            r7 = 1
            goto L8a
        L89:
            r7 = r2
        L8a:
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r6 = r4
        L8e:
            if (r6 == 0) goto L93
            r0.b(r6)
        L93:
            int r3 = r3 + 1
            goto L5c
        L96:
            ad.b1 r11 = r0.g()
            ad.h0 r11 = r11.listIterator(r2)
        L9e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r11.next()
            e5.l r0 = (e5.l) r0
            java.lang.String r0 = r0.f16256d
            boolean r0 = r10.a(r0)
            if (r0 == 0) goto L9e
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.q.b(j3.b0):void");
    }
}
