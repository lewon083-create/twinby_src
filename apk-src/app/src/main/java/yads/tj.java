package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f43334g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f43335h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f43336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f43337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rj f43338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f43339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy f43340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43341f;

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new vy());
    }

    public static sj b() {
        ArrayDeque arrayDeque = f43334g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new sj();
                }
                return (sj) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Message message) {
        int i = message.what;
        sj sjVar = null;
        if (i == 0) {
            sj sjVar2 = (sj) message.obj;
            try {
                this.f43336a.queueInputBuffer(sjVar2.f42946a, sjVar2.f42947b, sjVar2.f42948c, sjVar2.f42950e, sjVar2.f42951f);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference = this.f43339d;
                while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
                }
            }
            sjVar = sjVar2;
        } else if (i == 1) {
            sj sjVar3 = (sj) message.obj;
            int i10 = sjVar3.f42946a;
            int i11 = sjVar3.f42947b;
            MediaCodec.CryptoInfo cryptoInfo = sjVar3.f42949d;
            long j10 = sjVar3.f42950e;
            int i12 = sjVar3.f42951f;
            try {
                synchronized (f43335h) {
                    this.f43336a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
                }
            } catch (RuntimeException e7) {
                AtomicReference atomicReference2 = this.f43339d;
                while (!atomicReference2.compareAndSet(null, e7) && atomicReference2.get() == null) {
                }
            }
            sjVar = sjVar3;
        } else if (i != 2) {
            AtomicReference atomicReference3 = this.f43339d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            this.f43340e.d();
        }
        if (sjVar != null) {
            a(sjVar);
        }
    }

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread, vy vyVar) {
        this.f43336a = mediaCodec;
        this.f43337b = handlerThread;
        this.f43340e = vyVar;
        this.f43339d = new AtomicReference();
    }

    public final void a() {
        if (this.f43341f) {
            try {
                rj rjVar = this.f43338c;
                rjVar.getClass();
                rjVar.removeCallbacksAndMessages(null);
                vy vyVar = this.f43340e;
                synchronized (vyVar) {
                    vyVar.f44222a = false;
                }
                rj rjVar2 = this.f43338c;
                rjVar2.getClass();
                rjVar2.obtainMessage(2).sendToTarget();
                this.f43340e.a();
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }

    public final void a(int i, m20 m20Var, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.f43339d.getAndSet(null);
        if (runtimeException == null) {
            sj sjVarB = b();
            sjVarB.f42946a = i;
            sjVarB.f42947b = 0;
            sjVarB.f42948c = 0;
            sjVarB.f42950e = j10;
            sjVarB.f42951f = 0;
            MediaCodec.CryptoInfo cryptoInfo = sjVarB.f42949d;
            cryptoInfo.numSubSamples = m20Var.f40756f;
            int[] iArr = m20Var.f40754d;
            int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArrCopyOf != null && iArrCopyOf.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
                } else {
                    iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArrCopyOf;
            int[] iArr2 = m20Var.f40755e;
            int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr2 != null) {
                if (iArrCopyOf2 != null && iArrCopyOf2.length >= iArr2.length) {
                    System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
                } else {
                    iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
            byte[] bArr = m20Var.f40752b;
            byte[] bArrCopyOf = cryptoInfo.key;
            if (bArr != null) {
                if (bArrCopyOf != null && bArrCopyOf.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
                } else {
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArrCopyOf.getClass();
            cryptoInfo.key = bArrCopyOf;
            byte[] bArr2 = m20Var.f40751a;
            byte[] bArrCopyOf2 = cryptoInfo.iv;
            if (bArr2 != null) {
                if (bArrCopyOf2 != null && bArrCopyOf2.length >= bArr2.length) {
                    System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
                } else {
                    bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                }
            }
            bArrCopyOf2.getClass();
            cryptoInfo.iv = bArrCopyOf2;
            cryptoInfo.mode = m20Var.f40753c;
            if (lb3.f40466a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(m20Var.f40757g, m20Var.f40758h));
            }
            this.f43338c.obtainMessage(1, sjVarB).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public static void a(sj sjVar) {
        ArrayDeque arrayDeque = f43334g;
        synchronized (arrayDeque) {
            arrayDeque.add(sjVar);
        }
    }
}
