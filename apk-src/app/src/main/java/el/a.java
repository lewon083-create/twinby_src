package el;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import zk.d0;
import zk.i;
import zk.o;
import zk.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16433a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16434b;

    public a(i cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f16434b = cookieJar;
    }

    public static int c(d0 d0Var, int i) {
        String strA = d0.a("Retry-After", d0Var);
        if (strA == null) {
            return i;
        }
        if (!new Regex("\\d+").b(strA)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zk.x a(zk.d0 r13, com.google.android.gms.internal.ads.gn0 r14) throws java.net.ProtocolException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.a(zk.d0, com.google.android.gms.internal.ads.gn0):zk.x");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.io.IOException r4, dl.g r5, zk.x r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16434b
            zk.u r0 = (zk.u) r0
            boolean r0 = r0.f46480g
            r1 = 0
            if (r0 != 0) goto Lb
            goto Lb1
        Lb:
            if (r7 == 0) goto L1c
            zk.b0 r6 = r6.f46514d
            if (r6 == 0) goto L17
            boolean r6 = r6.isOneShot()
            if (r6 != 0) goto Lb1
        L17:
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1c
            return r1
        L1c:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L21
            return r1
        L21:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2c
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto Lb1
            if (r7 != 0) goto Lb1
            goto L3f
        L2c:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L3a
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L3a
            goto Lb1
        L3a:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L3f
            return r1
        L3f:
            dl.d r4 = r5.f15840h
            kotlin.jvm.internal.Intrinsics.b(r4)
            int r5 = r4.f15824a
            r6 = 1
            if (r5 != 0) goto L53
            int r7 = r4.f15825b
            if (r7 != 0) goto L53
            int r7 = r4.f15826c
            if (r7 != 0) goto L53
            r4 = r1
            goto Laf
        L53:
            java.lang.Object r7 = r4.i
            zk.g0 r7 = (zk.g0) r7
            if (r7 == 0) goto L5a
            goto Laa
        L5a:
            r7 = 0
            if (r5 > r6) goto L91
            int r5 = r4.f15825b
            if (r5 > r6) goto L91
            int r5 = r4.f15826c
            if (r5 <= 0) goto L66
            goto L91
        L66:
            java.lang.Cloneable r5 = r4.f15829f
            dl.g r5 = (dl.g) r5
            dl.j r5 = r5.i
            if (r5 != 0) goto L6f
            goto L91
        L6f:
            monitor-enter(r5)
            int r0 = r5.f15862l     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L76
            monitor-exit(r5)
            goto L91
        L76:
            zk.g0 r0 = r5.f15853b     // Catch: java.lang.Throwable -> L8e
            zk.a r0 = r0.f46385a     // Catch: java.lang.Throwable -> L8e
            zk.m r0 = r0.f46315h     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r4.f15828e     // Catch: java.lang.Throwable -> L8e
            zk.a r2 = (zk.a) r2     // Catch: java.lang.Throwable -> L8e
            zk.m r2 = r2.f46315h     // Catch: java.lang.Throwable -> L8e
            boolean r0 = al.b.a(r0, r2)     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L8a
            monitor-exit(r5)
            goto L91
        L8a:
            zk.g0 r7 = r5.f15853b     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)
            goto L91
        L8e:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L91:
            if (r7 == 0) goto L97
            r4.i = r7
        L95:
            r4 = r6
            goto Laf
        L97:
            java.lang.Object r5 = r4.f15830g
            com.google.android.gms.internal.ads.mc r5 = (com.google.android.gms.internal.ads.mc) r5
            if (r5 == 0) goto La4
            boolean r5 = r5.a()
            if (r5 != r6) goto La4
            goto Laa
        La4:
            java.lang.Object r4 = r4.f15831h
            com.google.android.gms.internal.ads.rq r4 = (com.google.android.gms.internal.ads.rq) r4
            if (r4 != 0) goto Lab
        Laa:
            goto L95
        Lab:
            boolean r4 = r4.j()
        Laf:
            if (r4 != 0) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.b(java.io.IOException, dl.g, zk.x, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        r5.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        return r9;
     */
    @Override // zk.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zk.d0 intercept(zk.n r29) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.intercept(zk.n):zk.d0");
    }

    public a(u client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f16434b = client;
    }
}
