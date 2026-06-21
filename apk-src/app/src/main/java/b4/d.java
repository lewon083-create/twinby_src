package b4;

import a0.d1;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.internal.ads.bx1;
import com.google.android.gms.internal.ads.cp1;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.kr0;
import com.google.android.gms.internal.ads.n90;
import com.google.android.gms.internal.ads.th0;
import com.google.android.gms.internal.ads.xo0;
import com.google.android.gms.internal.ads.xw1;
import com.google.android.gms.internal.ads.yw1;
import com.google.android.gms.internal.measurement.h5;
import g0.j2;
import g0.s1;
import g0.t1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m, bx1, t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1870g;

    public /* synthetic */ d(MediaCodec mediaCodec, HandlerThread handlerThread, yw1 yw1Var, n90 n90Var) {
        this.f1865b = mediaCodec;
        this.f1868e = new h(handlerThread, 1);
        this.f1869f = yw1Var;
        this.f1870g = n90Var;
        this.f1867d = 0;
    }

    public static void M(d dVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        bb.e eVar;
        LoudnessCodecController loudnessCodecController;
        h hVar = (h) dVar.f1868e;
        MediaCodec mediaCodec = (MediaCodec) dVar.f1865b;
        HandlerThread handlerThread = hVar.f1887c;
        h5.r(hVar.f1888d == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(hVar, handler);
        hVar.f1888d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((n) dVar.f1869f).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (eVar = (bb.e) dVar.f1870g) != null && ((loudnessCodecController = (LoudnessCodecController) eVar.f2021e) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            h5.r(((HashSet) eVar.f2019c).add(mediaCodec));
        }
        dVar.f1867d = 1;
    }

    public static String N(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public static String R(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // g0.t1
    public ed.d A() {
        Object obj = ((AtomicReference) this.f1868e).get();
        return obj instanceof g0.m ? new k0.l(1, ((g0.m) obj).f19653a) : k0.j.e(obj);
    }

    @Override // b4.m
    public void B(o4.h hVar, Handler handler) {
        ((MediaCodec) this.f1865b).setOnFrameRenderedListener(new b(this, hVar, 0), handler);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void C(int i, int i10, long j10, int i11) {
        yw1 yw1Var = (yw1) this.f1869f;
        yw1Var.b();
        xw1 xw1VarC = yw1.c();
        xw1VarC.f12362a = i;
        xw1VarC.f12363b = i10;
        xw1VarC.f12365d = j10;
        xw1VarC.f12366e = i11;
        e eVar = yw1Var.f12784c;
        String str = cq0.f4293a;
        eVar.obtainMessage(1, xw1VarC).sendToTarget();
    }

    @Override // b4.m
    public ByteBuffer D(int i) {
        return ((MediaCodec) this.f1865b).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void E(int i) {
        ((MediaCodec) this.f1865b).releaseOutputBuffer(i, false);
    }

    @Override // b4.m
    public void F(Surface surface) {
        ((MediaCodec) this.f1865b).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void G(int i, long j10) {
        ((MediaCodec) this.f1865b).releaseOutputBuffer(i, j10);
    }

    @Override // b4.m
    public ByteBuffer H(int i) {
        return ((MediaCodec) this.f1865b).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void I(th0 th0Var) {
        th0 th0Var2 = new th0(28, this, th0Var);
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            hVar.d();
            th0Var2.run();
        }
    }

    @Override // g0.t1
    public void J(Executor executor, s1 s1Var) {
        j2 j2Var;
        synchronized (this.f1865b) {
            O(s1Var);
            j2Var = new j2((AtomicReference) this.f1868e, executor, s1Var);
            ((HashMap) this.f1869f).put(s1Var, j2Var);
            ((CopyOnWriteArraySet) this.f1870g).add(j2Var);
        }
        j2Var.a(0);
    }

    @Override // b4.m
    public void K(ArrayList arrayList) {
        ((MediaCodec) this.f1865b).subscribeToVendorParameters(arrayList);
    }

    @Override // b4.m
    public void L(ArrayList arrayList) {
        ((MediaCodec) this.f1865b).unsubscribeFromVendorParameters(arrayList);
    }

    public void O(s1 s1Var) {
        j2 j2Var = (j2) ((HashMap) this.f1869f).remove(s1Var);
        if (j2Var != null) {
            j2Var.f19626d.set(false);
            ((CopyOnWriteArraySet) this.f1870g).remove(j2Var);
        }
    }

    public void P(Object obj) {
        Iterator it;
        int i;
        synchronized (this.f1865b) {
            try {
                if (Objects.equals(((AtomicReference) this.f1868e).getAndSet(obj), obj)) {
                    return;
                }
                int i10 = this.f1867d + 1;
                this.f1867d = i10;
                if (this.f1866c) {
                    return;
                }
                this.f1866c = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.f1870g).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((j2) it2.next()).a(i10);
                    } else {
                        synchronized (this.f1865b) {
                            try {
                                if (this.f1867d == i10) {
                                    this.f1866c = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.f1870g).iterator();
                                    i = this.f1867d;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i10 = i;
                    }
                }
            } finally {
            }
        }
    }

    public void Q(MediaFormat mediaFormat, Surface surface, int i) {
        n90 n90Var;
        LoudnessCodecController loudnessCodecController;
        h hVar = (h) this.f1868e;
        MediaCodec mediaCodec = (MediaCodec) this.f1865b;
        ix.k0(hVar.f1888d == null);
        HandlerThread handlerThread = hVar.f1887c;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(hVar, handler);
        hVar.f1888d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        yw1 yw1Var = (yw1) this.f1869f;
        if (!yw1Var.f12787f) {
            HandlerThread handlerThread2 = yw1Var.f12783b;
            handlerThread2.start();
            yw1Var.f12784c = new e(yw1Var, handlerThread2.getLooper());
            yw1Var.f12787f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (n90Var = (n90) this.f1870g) != null && ((loudnessCodecController = (LoudnessCodecController) n90Var.f8249d) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            ix.k0(((HashSet) n90Var.f8248c).add(mediaCodec));
        }
        this.f1867d = 1;
    }

    @Override // b4.m
    public void a(Bundle bundle) {
        ((n) this.f1869f).a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f1865b).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public ByteBuffer c(int i) {
        return ((MediaCodec) this.f1865b).getOutputBuffer(i);
    }

    @Override // b4.m
    public void d(int i, cp1 cp1Var, long j10, int i10) {
        ((n) this.f1869f).d(i, cp1Var, j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void e() {
        n90 n90Var;
        n90 n90Var2;
        try {
            try {
                if (this.f1867d == 1) {
                    yw1 yw1Var = (yw1) this.f1869f;
                    if (yw1Var.f12787f) {
                        yw1Var.a();
                        yw1Var.f12783b.quit();
                    }
                    yw1Var.f12787f = false;
                    h hVar = (h) this.f1868e;
                    synchronized (hVar.f1886b) {
                        hVar.f1897n = true;
                        hVar.f1887c.quit();
                        hVar.c();
                    }
                }
                this.f1867d = 2;
            } finally {
                if (!this.f1866c) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30 && i < 33) {
                        ((MediaCodec) this.f1865b).stop();
                    }
                    if (i >= 35 && (n90Var2 = (n90) this.f1870g) != null) {
                        n90Var2.o((MediaCodec) this.f1865b);
                    }
                    ((MediaCodec) this.f1865b).release();
                    this.f1866c = true;
                }
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (n90Var = (n90) this.f1870g) != null) {
                n90Var.o((MediaCodec) this.f1865b);
            }
            ((MediaCodec) this.f1865b).release();
            this.f1866c = true;
            throw th2;
        }
    }

    @Override // b4.m
    public void f(int i, int i10, long j10, int i11) {
        ((n) this.f1869f).f(i, i10, j10, i11);
    }

    @Override // b4.m
    public void flush() {
        ((n) this.f1869f).flush();
        ((MediaCodec) this.f1865b).flush();
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            hVar.f1896m++;
            Handler handler = hVar.f1888d;
            String str = z.f28608a;
            handler.post(new d1(6, hVar));
        }
        ((MediaCodec) this.f1865b).start();
    }

    @Override // b4.m
    public void g(int i) {
        ((MediaCodec) this.f1865b).releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void h(ArrayList arrayList) {
        ((MediaCodec) this.f1865b).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public int i() {
        ((yw1) this.f1869f).b();
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            try {
                hVar.d();
                boolean z5 = true;
                int iE = -1;
                if (hVar.f1896m > 0 || hVar.f1897n) {
                    return -1;
                }
                androidx.datastore.preferences.protobuf.l lVar = hVar.f1889e;
                if (lVar.f1435b != lVar.f1436c) {
                    z5 = false;
                }
                if (!z5) {
                    iE = lVar.e();
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void j(Bundle bundle) {
        yw1 yw1Var = (yw1) this.f1869f;
        yw1Var.b();
        e eVar = yw1Var.f12784c;
        String str = cq0.f4293a;
        eVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public MediaFormat k() {
        MediaFormat mediaFormat;
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            try {
                mediaFormat = hVar.i;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // b4.m
    public boolean l(a7.l lVar) {
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            hVar.f1899p = lVar;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void m(Surface surface) {
        ((MediaCodec) this.f1865b).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void n() {
        ((yw1) this.f1869f).a();
        MediaCodec mediaCodec = (MediaCodec) this.f1865b;
        mediaCodec.flush();
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            hVar.f1896m++;
            Handler handler = hVar.f1888d;
            String str = cq0.f4293a;
            handler.post(new kr0(19, hVar));
        }
        mediaCodec.start();
    }

    @Override // b4.m
    public MediaFormat o() {
        MediaFormat mediaFormat;
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            try {
                mediaFormat = hVar.i;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // b4.m
    public void p() {
        ((MediaCodec) this.f1865b).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public boolean q(xo0 xo0Var) {
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            hVar.f1899p = xo0Var;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void r() {
        ((MediaCodec) this.f1865b).detachOutputSurface();
    }

    @Override // b4.m
    public void release() {
        bb.e eVar;
        bb.e eVar2;
        try {
            if (this.f1867d == 1) {
                ((n) this.f1869f).shutdown();
                h hVar = (h) this.f1868e;
                synchronized (hVar.f1886b) {
                    hVar.f1897n = true;
                    hVar.f1887c.quit();
                    hVar.a();
                }
            }
            this.f1867d = 2;
            if (this.f1866c) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.f1865b).stop();
                }
                if (i >= 35 && (eVar2 = (bb.e) this.f1870g) != null) {
                    eVar2.D((MediaCodec) this.f1865b);
                }
                ((MediaCodec) this.f1865b).release();
                this.f1866c = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.f1866c) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        ((MediaCodec) this.f1865b).stop();
                    }
                    if (i10 >= 35 && (eVar = (bb.e) this.f1870g) != null) {
                        eVar.D((MediaCodec) this.f1865b);
                    }
                    ((MediaCodec) this.f1865b).release();
                    this.f1866c = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // b4.m
    public void s(int i, long j10) {
        ((MediaCodec) this.f1865b).releaseOutputBuffer(i, j10);
    }

    @Override // b4.m
    public void setVideoScalingMode(int i) {
        ((MediaCodec) this.f1865b).setVideoScalingMode(i);
    }

    @Override // b4.m
    public int t() {
        ((n) this.f1869f).h();
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            try {
                hVar.b();
                boolean z5 = true;
                int iE = -1;
                if (hVar.f1896m > 0 || hVar.f1897n) {
                    return -1;
                }
                androidx.datastore.preferences.protobuf.l lVar = hVar.f1889e;
                if (lVar.f1435b != lVar.f1436c) {
                    z5 = false;
                }
                if (!z5) {
                    iE = lVar.e();
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public int u(MediaCodec.BufferInfo bufferInfo) {
        ((yw1) this.f1869f).b();
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            try {
                hVar.d();
                boolean z5 = true;
                if (hVar.f1896m > 0 || hVar.f1897n) {
                    return -1;
                }
                androidx.datastore.preferences.protobuf.l lVar = hVar.f1890f;
                if (lVar.f1435b != lVar.f1436c) {
                    z5 = false;
                }
                if (z5) {
                    return -1;
                }
                int iE = lVar.e();
                if (iE >= 0) {
                    if (hVar.i == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) hVar.f1891g.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    hVar.i = (MediaFormat) hVar.f1892h.remove();
                    iE = -2;
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // g0.t1
    public void v(s1 s1Var) {
        synchronized (this.f1865b) {
            O(s1Var);
        }
    }

    @Override // b4.m
    public int w(MediaCodec.BufferInfo bufferInfo) {
        ((n) this.f1869f).h();
        h hVar = (h) this.f1868e;
        synchronized (hVar.f1886b) {
            try {
                hVar.b();
                boolean z5 = true;
                if (hVar.f1896m > 0 || hVar.f1897n) {
                    return -1;
                }
                androidx.datastore.preferences.protobuf.l lVar = hVar.f1890f;
                if (lVar.f1435b != lVar.f1436c) {
                    z5 = false;
                }
                if (z5) {
                    return -1;
                }
                int iE = lVar.e();
                if (iE >= 0) {
                    hVar.i.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) hVar.f1891g.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    hVar.i = (MediaFormat) hVar.f1892h.remove();
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void x(int i) {
        ((MediaCodec) this.f1865b).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void y(int i, cp1 cp1Var, long j10, int i10) {
        int length;
        int length2;
        int length3;
        int length4;
        yw1 yw1Var = (yw1) this.f1869f;
        yw1Var.b();
        xw1 xw1VarC = yw1.c();
        xw1VarC.f12362a = i;
        xw1VarC.f12363b = 0;
        xw1VarC.f12365d = j10;
        xw1VarC.f12366e = i10;
        MediaCodec.CryptoInfo cryptoInfo = xw1VarC.f12364c;
        cryptoInfo.numSubSamples = cp1Var.f4284f;
        int[] iArr = cp1Var.f4282d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cp1Var.f4283e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cp1Var.f4280b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = cp1Var.f4279a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = cp1Var.f4281c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cp1Var.f4285g, cp1Var.f4286h));
        e eVar = yw1Var.f12784c;
        String str = cq0.f4293a;
        eVar.obtainMessage(2, xw1VarC).sendToTarget();
    }

    @Override // b4.m
    public void z(a0.d dVar) {
        h hVar = (h) this.f1868e;
        a0.d dVar2 = new a0.d(10, this, dVar);
        synchronized (hVar.f1886b) {
            hVar.b();
            dVar2.run();
        }
    }

    public d(Object obj) {
        this.f1865b = new Object();
        this.f1867d = 0;
        this.f1866c = false;
        this.f1869f = new HashMap();
        this.f1870g = new CopyOnWriteArraySet();
        this.f1868e = new AtomicReference(obj);
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread, n nVar, bb.e eVar) {
        this.f1865b = mediaCodec;
        this.f1868e = new h(handlerThread, 0);
        this.f1869f = nVar;
        this.f1870g = eVar;
        this.f1867d = 0;
    }
}
