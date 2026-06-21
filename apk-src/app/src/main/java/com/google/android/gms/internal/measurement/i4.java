package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.as0;
import com.google.android.gms.internal.ads.bd1;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.di0;
import com.google.android.gms.internal.ads.dk0;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.ki;
import com.google.android.gms.internal.ads.l81;
import com.google.android.gms.internal.ads.lh;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.xr0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 implements g0.k1, b4.l, k81, oa.m, k0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static i4 f13780e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13783d;

    public i4(int i) {
        switch (i) {
            case 4:
                this.f13782c = new Object();
                this.f13783d = null;
                this.f13781b = false;
                break;
            case 6:
                this.f13783d = u9.b.f34371b;
                break;
            case 9:
                this.f13782c = new ArrayList();
                this.f13783d = bd1.f3764b;
                this.f13781b = false;
                break;
            case 14:
                this.f13782c = new Object();
                break;
            default:
                this.f13781b = false;
                this.f13782c = null;
                this.f13783d = null;
                break;
        }
    }

    public static boolean a(a0.i0 i0Var, a0.i0 i0Var2) {
        boolean zB = i0Var2.b();
        int i = i0Var2.f117a;
        f2.g.h("Fully specified range is not actually fully specified.", zB);
        int i10 = i0Var.f117a;
        if (i10 == 2 && i == 1) {
            return false;
        }
        if (i10 != 2 && i10 != 0 && i10 != i) {
            return false;
        }
        int i11 = i0Var.f118b;
        return i11 == 0 || i11 == i0Var2.f118b;
    }

    public static boolean b(a0.i0 i0Var, a0.i0 i0Var2, HashSet hashSet) {
        if (hashSet.contains(i0Var2)) {
            return a(i0Var, i0Var2);
        }
        com.google.android.gms.internal.auth.g.e("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + i0Var + "\nCandidate dynamic range:\n  " + i0Var2);
        return false;
    }

    public static a0.i0 f(a0.i0 i0Var, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (i0Var.f117a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            a0.i0 i0Var2 = (a0.i0) it.next();
            f2.g.g(i0Var2, "Fully specified DynamicRange cannot be null.");
            int i = i0Var2.f117a;
            f2.g.h("Fully specified DynamicRange must have fully defined encoding.", i0Var2.b());
            if (i != 1 && b(i0Var, i0Var2, hashSet)) {
                return i0Var2;
            }
        }
        return null;
    }

    public static void l(HashSet hashSet, a0.i0 i0Var, k6.t0 t0Var) {
        f2.g.h("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set setC = ((v.b) t0Var.f27180c).c(i0Var);
        if (setC.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setC);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + i0Var + "\nConstraints:\n  " + TextUtils.join("\n  ", setC) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    public static i4 m(Context context) {
        i4 i4Var;
        synchronized (i4.class) {
            try {
                if (f13780e == null) {
                    f13780e = rl.b.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new i4(context, 0) : new i4(0);
                }
                i4 i4Var2 = f13780e;
                if (i4Var2 != null && ((com.google.android.gms.internal.auth.e) i4Var2.f13783d) != null && !i4Var2.f13781b) {
                    try {
                        context.getContentResolver().registerContentObserver(a4.f13649a, true, (com.google.android.gms.internal.auth.e) f13780e.f13783d);
                        i4 i4Var3 = f13780e;
                        i4Var3.getClass();
                        i4Var3.f13781b = true;
                    } catch (SecurityException e3) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e3);
                    }
                }
                i4Var = f13780e;
                i4Var.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i4Var;
    }

    public boolean A() {
        synchronized (this.f13782c) {
            try {
                lh lhVar = (lh) this.f13783d;
                if (lhVar == null) {
                    return false;
                }
                return lhVar.f7514e.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:11:0x0024, B:13:0x002f, B:14:0x0034, B:18:0x003a, B:20:0x0046, B:23:0x004d, B:25:0x0050, B:28:0x005e, B:31:0x0064, B:33:0x006e, B:36:0x00da, B:34:0x00b2, B:35:0x00d5), top: B:44:0x0024 }] */
    @Override // oa.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void accept(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i4.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override // g0.k1
    public a0.r1 acquireLatestImage() {
        Image imageAcquireLatestImage;
        synchronized (this.f13783d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.f13782c).acquireLatestImage();
            } catch (RuntimeException e3) {
                if (!"ImageReaderContext is not initialized".equals(e3.getMessage())) {
                    throw e3;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a0.b(imageAcquireLatestImage);
        }
    }

    @Override // g0.k1
    public void c(final g0.j1 j1Var, final Executor executor) {
        synchronized (this.f13783d) {
            this.f13781b = false;
            ((ImageReader) this.f13782c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: a0.c
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    i4 i4Var = this.f47a;
                    Executor executor2 = executor;
                    g0.j1 j1Var2 = j1Var;
                    synchronized (i4Var.f13783d) {
                        try {
                            if (!i4Var.f13781b) {
                                executor2.execute(new d(0, i4Var, j1Var2));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }, i0.o.x());
        }
    }

    @Override // g0.k1
    public void close() {
        synchronized (this.f13783d) {
            ((ImageReader) this.f13782c).close();
        }
    }

    @Override // b4.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b4.d j(q9.o oVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        b4.n gVar;
        int i;
        String str = ((b4.p) oVar.f31946a).f1907a;
        b4.d dVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.f13781b || Build.VERSION.SDK_INT < 36) {
                    gVar = new b4.g(mediaCodecCreateByCodecName, (HandlerThread) ((b4.c) this.f13783d).get());
                    i = 0;
                } else {
                    gVar = new fe.c(5, mediaCodecCreateByCodecName);
                    i = 4;
                }
                b4.d dVar2 = new b4.d(mediaCodecCreateByCodecName, (HandlerThread) ((b4.c) this.f13782c).get(), gVar, (bb.e) oVar.f31951f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) oVar.f31949d;
                    if (surface == null && ((b4.p) oVar.f31946a).f1914h && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    b4.d.M(dVar2, (MediaFormat) oVar.f31947b, surface, (MediaCrypto) oVar.f31950e, i);
                    return dVar2;
                } catch (Exception e3) {
                    e = e3;
                    dVar = dVar2;
                    if (dVar != null) {
                        dVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // g0.k1
    public int e() {
        int imageFormat;
        synchronized (this.f13783d) {
            imageFormat = ((ImageReader) this.f13782c).getImageFormat();
        }
        return imageFormat;
    }

    public void g(double d10, double d11) {
        double[] dArr = (double[]) this.f13782c;
        double d12 = 1.0d;
        if (!this.f13781b) {
            d12 = 1.0d / (((dArr[7] * d11) + (dArr[3] * d10)) + dArr[15]);
        }
        double d13 = ((dArr[4] * d11) + (dArr[0] * d10) + dArr[12]) * d12;
        double d14 = ((dArr[5] * d11) + (dArr[1] * d10) + dArr[13]) * d12;
        double[] dArr2 = (double[]) this.f13783d;
        if (d13 < dArr2[0]) {
            dArr2[0] = d13;
        } else if (d13 > dArr2[1]) {
            dArr2[1] = d13;
        }
        if (d14 < dArr2[2]) {
            dArr2[2] = d14;
        } else if (d14 > dArr2[3]) {
            dArr2[3] = d14;
        }
    }

    @Override // g0.k1
    public int getHeight() {
        int height;
        synchronized (this.f13783d) {
            height = ((ImageReader) this.f13782c).getHeight();
        }
        return height;
    }

    @Override // g0.k1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f13783d) {
            surface = ((ImageReader) this.f13782c).getSurface();
        }
        return surface;
    }

    @Override // g0.k1
    public int getWidth() {
        int width;
        synchronized (this.f13783d) {
            width = ((ImageReader) this.f13782c).getWidth();
        }
        return width;
    }

    @Override // g0.k1
    public void h() {
        synchronized (this.f13783d) {
            this.f13781b = true;
            ((ImageReader) this.f13782c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        xr0 xr0Var = (xr0) this.f13783d;
        xr0Var.a(true);
        as0 as0Var = (as0) this.f13782c;
        as0Var.a(xr0Var);
        if (this.f13781b) {
            as0Var.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        xr0 xr0Var = (xr0) this.f13783d;
        if (xr0Var.j()) {
            as0 as0Var = (as0) this.f13782c;
            xr0Var.g(th2);
            xr0Var.a(false);
            as0Var.a(xr0Var);
            if (this.f13781b) {
                as0Var.h();
            }
        }
    }

    public synchronized oa.k n() {
        return (oa.k) this.f13782c;
    }

    public void o(Context context) {
        synchronized (this.f13782c) {
            try {
                if (!this.f13781b) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        u9.i.h("Can not cast Context to Application");
                        return;
                    }
                    if (((lh) this.f13783d) == null) {
                        this.f13783d = new lh();
                    }
                    lh lhVar = (lh) this.f13783d;
                    if (!lhVar.f7518j) {
                        application.registerActivityLifecycleCallbacks(lhVar);
                        if (context instanceof Activity) {
                            lhVar.a((Activity) context);
                        }
                        lhVar.f7512c = application;
                        lhVar.f7519k = ((Long) q9.s.f31967e.f31970c.a(al.f3175r1)).longValue();
                        lhVar.f7518j = true;
                    }
                    this.f13781b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return;
        }
        com.google.android.gms.internal.auth.g.l("VideoCapture", "Surface update completed with unexpected exception", th2);
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        int i;
        j1.k kVar = (j1.k) this.f13782c;
        x0.k0 k0Var = (x0.k0) this.f13783d;
        if (kVar != k0Var.f35636u || (i = k0Var.f35638w) == 3) {
            return;
        }
        int i10 = this.f13781b ? 1 : 2;
        if (i10 != i) {
            k0Var.f35638w = i10;
            k0Var.M().e(i10);
        }
    }

    public void p(sb.l lVar) {
        synchronized (this.f13782c) {
            try {
                if (((ArrayDeque) this.f13783d) == null) {
                    this.f13783d = new ArrayDeque();
                }
                ((ArrayDeque) this.f13783d).add(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.k1
    public int q() {
        int maxImages;
        synchronized (this.f13783d) {
            maxImages = ((ImageReader) this.f13782c).getMaxImages();
        }
        return maxImages;
    }

    @Override // g0.k1
    public a0.r1 r() {
        Image imageAcquireNextImage;
        synchronized (this.f13783d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.f13782c).acquireNextImage();
            } catch (RuntimeException e3) {
                if (!"ImageReaderContext is not initialized".equals(e3.getMessage())) {
                    throw e3;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a0.b(imageAcquireNextImage);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String s(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f13782c
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L8f
            boolean r2 = com.google.android.gms.internal.measurement.d4.f13700b
            r3 = 1
            if (r2 == 0) goto Ld
            goto L5b
        Ld:
            java.lang.Class<com.google.android.gms.internal.measurement.d4> r2 = com.google.android.gms.internal.measurement.d4.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.d4.f13700b     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L5b
        L16:
            r9 = move-exception
            goto L8d
        L19:
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L51
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.d4.f13699a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L2c
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L16
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.d4.f13699a = r5     // Catch: java.lang.Throwable -> L16
        L2c:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.d4.f13699a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L32
            r6 = r3
            goto L55
        L32:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r7 != 0) goto L42
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r0 != 0) goto L51
        L42:
            r6 = r3
            goto L51
        L44:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.d4.f13699a = r1     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            goto L1a
        L51:
            if (r6 == 0) goto L55
            com.google.android.gms.internal.measurement.d4.f13699a = r1     // Catch: java.lang.Throwable -> L16
        L55:
            if (r6 == 0) goto L59
            com.google.android.gms.internal.measurement.d4.f13700b = r3     // Catch: java.lang.Throwable -> L16
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            r3 = r6
        L5b:
            if (r3 != 0) goto L5e
            goto L8f
        L5e:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.a()     // Catch: java.lang.SecurityException -> L68 java.lang.NullPointerException -> L76 java.lang.IllegalStateException -> L7a
            goto L73
        L68:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L7c
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L73:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            return r0
        L76:
            r0 = move-exception
            goto L81
        L78:
            r0 = move-exception
            goto L81
        L7a:
            r0 = move-exception
            goto L81
        L7c:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            throw r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L81:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r9, r0)
            return r1
        L8d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i4.s(java.lang.String):java.lang.String");
    }

    public /* synthetic */ void t() {
        synchronized (this.f13783d) {
            try {
                ki kiVar = (ki) this.f13782c;
                if (kiVar == null) {
                    return;
                }
                kiVar.f();
                this.f13782c = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void u(int i) {
        if (this.f13781b) {
            return;
        }
        this.f13781b = true;
        z(new q9.x1(i, dk0.c(i, ((ci0) this.f13782c).f4216a), StringUtils.UNDEFINED, null, null));
    }

    public void v(mh mhVar) {
        synchronized (this.f13782c) {
            try {
                if (((lh) this.f13783d) == null) {
                    this.f13783d = new lh();
                }
                lh lhVar = (lh) this.f13783d;
                synchronized (lhVar.f7513d) {
                    lhVar.f7516g.add(mhVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w(Task task) {
        sb.l lVar;
        synchronized (this.f13782c) {
            if (((ArrayDeque) this.f13783d) != null && !this.f13781b) {
                this.f13781b = true;
                while (true) {
                    synchronized (this.f13782c) {
                        try {
                            lVar = (sb.l) ((ArrayDeque) this.f13783d).poll();
                            if (lVar == null) {
                                this.f13781b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.a(task);
                }
            }
        }
    }

    public void x(mh mhVar) {
        synchronized (this.f13782c) {
            try {
                lh lhVar = (lh) this.f13783d;
                if (lhVar == null) {
                    return;
                }
                synchronized (lhVar.f7513d) {
                    lhVar.f7516g.remove(mhVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Activity y() {
        synchronized (this.f13782c) {
            try {
                lh lhVar = (lh) this.f13783d;
                if (lhVar == null) {
                    return null;
                }
                return lhVar.f7511b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void z(q9.x1 x1Var) {
        int i = 1;
        if (true == ((Boolean) q9.s.f31967e.f31970c.a(al.p6)).booleanValue()) {
            i = 3;
        }
        ((jx) this.f13783d).d(new di0(i, x1Var));
    }

    public i4(Context context, int i) {
        switch (i) {
            case 5:
                this.f13783d = new Object();
                break;
            case 6:
                ExecutorService executorService = u9.b.f34371b;
                this.f13783d = executorService;
                executorService.execute(new l81(6, this, context));
                break;
            default:
                this.f13781b = false;
                this.f13782c = context;
                this.f13783d = new com.google.android.gms.internal.auth.e(null, 2);
                break;
        }
    }

    public i4(ImageReader imageReader) {
        this.f13783d = new Object();
        this.f13781b = true;
        this.f13782c = imageReader;
    }
}
