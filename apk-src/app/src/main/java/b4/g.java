package b4;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.internal.ads.cp1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ArrayDeque f1878h = new ArrayDeque();
    public static final Object i = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec f1879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f1880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f1881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f1882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.f f1883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1884g;

    public g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        m3.f fVar = new m3.f();
        this.f1879b = mediaCodec;
        this.f1880c = handlerThread;
        this.f1883f = fVar;
        this.f1882e = new AtomicReference();
    }

    public static f b() {
        ArrayDeque arrayDeque = f1878h;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new f();
                }
                return (f) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b4.n
    public final void a(Bundle bundle) {
        h();
        e eVar = this.f1881d;
        String str = z.f28608a;
        eVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // b4.n
    public final void d(int i10, cp1 cp1Var, long j10, int i11) {
        h();
        f fVarB = b();
        fVarB.f1873a = i10;
        fVarB.f1874b = 0;
        fVarB.f1876d = j10;
        fVarB.f1877e = i11;
        MediaCodec.CryptoInfo cryptoInfo = fVarB.f1875c;
        cryptoInfo.numSubSamples = cp1Var.f4284f;
        int[] iArr = cp1Var.f4282d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cp1Var.f4283e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cp1Var.f4280b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = cp1Var.f4279a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = cp1Var.f4281c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cp1Var.f4285g, cp1Var.f4286h));
        e eVar = this.f1881d;
        String str = z.f28608a;
        eVar.obtainMessage(2, fVarB).sendToTarget();
    }

    @Override // b4.n
    public final void f(int i10, int i11, long j10, int i12) {
        h();
        f fVarB = b();
        fVarB.f1873a = i10;
        fVarB.f1874b = i11;
        fVarB.f1876d = j10;
        fVarB.f1877e = i12;
        e eVar = this.f1881d;
        String str = z.f28608a;
        eVar.obtainMessage(1, fVarB).sendToTarget();
    }

    @Override // b4.n
    public final void flush() {
        if (this.f1884g) {
            try {
                e eVar = this.f1881d;
                eVar.getClass();
                eVar.removeCallbacksAndMessages(null);
                m3.f fVar = this.f1883f;
                synchronized (fVar) {
                    fVar.f28562b = false;
                }
                e eVar2 = this.f1881d;
                eVar2.getClass();
                eVar2.obtainMessage(3).sendToTarget();
                synchronized (fVar) {
                    while (!fVar.f28562b) {
                        fVar.f28561a.getClass();
                        fVar.wait();
                    }
                }
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }

    @Override // b4.n
    public final void h() {
        RuntimeException runtimeException = (RuntimeException) this.f1882e.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // b4.n
    public final void shutdown() {
        if (this.f1884g) {
            flush();
            this.f1880c.quit();
        }
        this.f1884g = false;
    }

    @Override // b4.n
    public final void start() {
        if (this.f1884g) {
            return;
        }
        HandlerThread handlerThread = this.f1880c;
        handlerThread.start();
        this.f1881d = new e(this, handlerThread.getLooper());
        this.f1884g = true;
    }
}
