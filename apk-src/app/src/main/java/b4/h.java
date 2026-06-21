package b4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.pt1;
import com.google.android.gms.internal.ads.xo0;
import java.util.ArrayDeque;
import s3.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f1887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f1888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.l f1889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.l f1890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f1892h;
    public MediaFormat i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaFormat f1893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CodecException f1894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MediaCodec.CryptoException f1895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IllegalStateException f1898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1899p;

    public h(HandlerThread handlerThread, int i) {
        this.f1885a = i;
        switch (i) {
            case 1:
                this.f1886b = new Object();
                this.f1887c = handlerThread;
                this.f1889e = new androidx.datastore.preferences.protobuf.l(3);
                this.f1890f = new androidx.datastore.preferences.protobuf.l(3);
                this.f1891g = new ArrayDeque();
                this.f1892h = new ArrayDeque();
                break;
            default:
                this.f1886b = new Object();
                this.f1887c = handlerThread;
                this.f1889e = new androidx.datastore.preferences.protobuf.l(3);
                this.f1890f = new androidx.datastore.preferences.protobuf.l(3);
                this.f1891g = new ArrayDeque();
                this.f1892h = new ArrayDeque();
                break;
        }
    }

    public void a() {
        ArrayDeque arrayDeque = this.f1892h;
        if (!arrayDeque.isEmpty()) {
            this.f1893j = (MediaFormat) arrayDeque.getLast();
        }
        androidx.datastore.preferences.protobuf.l lVar = this.f1889e;
        lVar.f1436c = lVar.f1435b;
        androidx.datastore.preferences.protobuf.l lVar2 = this.f1890f;
        lVar2.f1436c = lVar2.f1435b;
        this.f1891g.clear();
        arrayDeque.clear();
    }

    public void b() {
        IllegalStateException illegalStateException = this.f1898o;
        if (illegalStateException != null) {
            this.f1898o = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f1894k;
        if (codecException != null) {
            this.f1894k = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f1895l;
        if (cryptoException == null) {
            return;
        }
        this.f1895l = null;
        throw cryptoException;
    }

    public void c() {
        ArrayDeque arrayDeque = this.f1892h;
        if (!arrayDeque.isEmpty()) {
            this.f1893j = (MediaFormat) arrayDeque.getLast();
        }
        androidx.datastore.preferences.protobuf.l lVar = this.f1889e;
        lVar.f1436c = lVar.f1435b;
        androidx.datastore.preferences.protobuf.l lVar2 = this.f1890f;
        lVar2.f1436c = lVar2.f1435b;
        this.f1891g.clear();
        arrayDeque.clear();
    }

    public void d() {
        IllegalStateException illegalStateException = this.f1898o;
        if (illegalStateException != null) {
            this.f1898o = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f1894k;
        if (codecException != null) {
            this.f1894k = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f1895l;
        if (cryptoException == null) {
            return;
        }
        this.f1895l = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        switch (this.f1885a) {
            case 0:
                synchronized (this.f1886b) {
                    this.f1895l = cryptoException;
                    break;
                }
                return;
            default:
                synchronized (this.f1886b) {
                    this.f1895l = cryptoException;
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        switch (this.f1885a) {
            case 0:
                synchronized (this.f1886b) {
                    this.f1894k = codecException;
                    break;
                }
                return;
            default:
                synchronized (this.f1886b) {
                    this.f1894k = codecException;
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        a0 a0Var;
        pt1 pt1Var;
        switch (this.f1885a) {
            case 0:
                synchronized (this.f1886b) {
                    this.f1889e.a(i);
                    a7.l lVar = (a7.l) this.f1899p;
                    if (lVar != null && (a0Var = ((s) lVar.f491c).K) != null) {
                        a0Var.a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f1886b) {
                    try {
                        this.f1889e.a(i);
                        xo0 xo0Var = (xo0) this.f1899p;
                        if (xo0Var != null && (pt1Var = ((gx1) xo0Var.f12221c).I) != null) {
                            pt1Var.a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        a0 a0Var;
        pt1 pt1Var;
        switch (this.f1885a) {
            case 0:
                synchronized (this.f1886b) {
                    try {
                        MediaFormat mediaFormat = this.f1893j;
                        if (mediaFormat != null) {
                            this.f1890f.a(-2);
                            this.f1892h.add(mediaFormat);
                            this.f1893j = null;
                        }
                        this.f1890f.a(i);
                        this.f1891g.add(bufferInfo);
                        a7.l lVar = (a7.l) this.f1899p;
                        if (lVar != null && (a0Var = ((s) lVar.f491c).K) != null) {
                            a0Var.a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f1886b) {
                    try {
                        MediaFormat mediaFormat2 = this.f1893j;
                        if (mediaFormat2 != null) {
                            this.f1890f.a(-2);
                            this.f1892h.add(mediaFormat2);
                            this.f1893j = null;
                        }
                        this.f1890f.a(i);
                        this.f1891g.add(bufferInfo);
                        xo0 xo0Var = (xo0) this.f1899p;
                        if (xo0Var != null && (pt1Var = ((gx1) xo0Var.f12221c).I) != null) {
                            pt1Var.a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        switch (this.f1885a) {
            case 0:
                synchronized (this.f1886b) {
                    this.f1890f.a(-2);
                    this.f1892h.add(mediaFormat);
                    this.f1893j = null;
                    break;
                }
                return;
            default:
                synchronized (this.f1886b) {
                    this.f1890f.a(-2);
                    this.f1892h.add(mediaFormat);
                    this.f1893j = null;
                    break;
                }
                return;
        }
    }
}
