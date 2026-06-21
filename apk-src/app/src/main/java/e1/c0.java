package e1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import com.google.android.gms.internal.ads.om1;
import g0.s2;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements m {
    public static final Range H = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public ScheduledFuture F;
    public int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15917a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f15920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaFormat f15921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaCodec f15922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f15923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f15924h;
    public final j0.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ed.d f15925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j1.h f15926k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s2 f15932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a1.e f15933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rational f15934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f15935t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15918b = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f15927l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f15928m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashSet f15929n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashSet f15930o = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f15931p = new ArrayDeque();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f15936u = n.K1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Executor f15937v = hl.d.j();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Range f15938w = H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15939x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15940y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f15941z = null;
    public ScheduledFuture A = null;
    public a0 B = null;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;

    public c0(Executor executor, o oVar, int i) throws e0 {
        boolean z5 = false;
        executor.getClass();
        oVar.getClass();
        this.f15920d = oVar;
        LruCache lruCache = f1.a.f16560a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(oVar.c());
            this.f15922f = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.i = new j0.i(executor);
            MediaFormat mediaFormatA = oVar.a();
            this.f15921e = mediaFormatA;
            s2 s2VarB = oVar.b();
            this.f15932q = s2VarB;
            this.f15933r = new a1.e(14, new a0.a0(11, this), new nc.e(), z5);
            if (oVar instanceof b) {
                b bVar = (b) oVar;
                this.f15917a = "AudioEncoder";
                this.f15919c = false;
                this.f15923g = new x(this);
                a aVar = new a(codecInfo, oVar.c());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) aVar.f15951b).getAudioCapabilities());
                this.f15924h = aVar;
                this.f15934s = new Rational(bVar.f15899e, bVar.f15900f);
            } else {
                if (!(oVar instanceof d)) {
                    throw new e0("Unknown encoder config type");
                }
                d dVar = (d) oVar;
                this.f15917a = "VideoEncoder";
                this.f15919c = true;
                this.f15923g = new b0(this);
                j0 j0Var = new j0(codecInfo, oVar.c());
                if (mediaFormatA.containsKey("bitrate")) {
                    int integer = mediaFormatA.getInteger("bitrate");
                    int iIntValue = ((Integer) j0Var.f15974c.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatA.setInteger("bitrate", iIntValue);
                        com.google.android.gms.internal.auth.g.e("VideoEncoder", "updated bitrate from " + integer + " to " + iIntValue);
                    }
                }
                this.f15924h = j0Var;
                this.f15934s = new Rational(dVar.f15948g, dVar.f15949h);
            }
            com.google.android.gms.internal.auth.g.e(this.f15917a, "mInputTimebase = " + s2VarB);
            com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaFormat = " + mediaFormatA);
            com.google.android.gms.internal.auth.g.e(this.f15917a, "mCaptureToEncodeFrameRateRatio = " + this.f15934s);
            try {
                i();
                AtomicReference atomicReference = new AtomicReference();
                this.f15925j = k0.j.f(i0.o.w(new f(atomicReference, 3)));
                j1.h hVar = (j1.h) atomicReference.get();
                hVar.getClass();
                this.f15926k = hVar;
                if (this.f15919c && i == 1 && c1.a.f2187a.i(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                    z5 = true;
                }
                this.f15935t = z5;
                k(1);
            } catch (MediaCodec.CodecException e3) {
                throw new e0(e3);
            }
        } catch (IOException | IllegalArgumentException e7) {
            throw new e0(e7);
        }
    }

    public final ed.d a() {
        switch (t.z.m(this.G)) {
            case 0:
                return new k0.l(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                j1.k kVarW = i0.o.w(new f(atomicReference, 2));
                j1.h hVar = (j1.h) atomicReference.get();
                hVar.getClass();
                this.f15928m.offer(hVar);
                hVar.a(new a0.d(25, this, hVar), this.i);
                d();
                return kVarW;
            case 7:
                return new k0.l(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new k0.l(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(om1.E(this.G)));
        }
    }

    public final void b(String str, Throwable th2, int i) {
        switch (t.z.m(this.G)) {
            case 0:
                e(str, th2, i);
                i();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                k(8);
                n(new r(this, i, str, th2));
                break;
            case 7:
                com.google.android.gms.internal.auth.g.P(this.f15917a, "Get more than one error: " + str + "(" + i + ")", th2);
                break;
        }
    }

    public final boolean c() {
        Rational rational = this.f15934s;
        return true ^ (rational != null && rational.getDenominator() == rational.getNumerator());
    }

    public final void d() {
        while (true) {
            ArrayDeque arrayDeque = this.f15928m;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f15927l;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            j1.h hVar = (j1.h) arrayDeque.poll();
            Objects.requireNonNull(hVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                t tVar = new t(this, this.f15922f, num.intValue());
                if (hVar.b(tVar)) {
                    this.f15929n.add(tVar);
                    k0.j.f(tVar.f15991d).a(new a0.d(23, this, tVar), this.i);
                } else {
                    tVar.a();
                }
            } catch (MediaCodec.CodecException e3) {
                b(e3.getMessage(), e3, 1);
                return;
            }
        }
    }

    public final void e(String str, Throwable th2, int i) {
        n nVar;
        Executor executor;
        synchronized (this.f15918b) {
            nVar = this.f15936u;
            executor = this.f15937v;
        }
        try {
            executor.execute(new a1.c(nVar, i, str, th2));
        } catch (RejectedExecutionException e3) {
            com.google.android.gms.internal.auth.g.l(this.f15917a, "Unable to post to the supplied executor.", e3);
        }
    }

    public final void f() {
        this.i.execute(new q(this, this.f15933r.i(), 0));
    }

    public final void g() {
        Surface surface;
        HashSet hashSet;
        com.google.android.gms.internal.auth.g.e(this.f15917a, "releaseInternal");
        if (this.C) {
            if (!this.f15935t) {
                com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.stop()");
                this.f15922f.stop();
            }
            this.C = false;
        }
        com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.release()");
        this.f15922f.release();
        k kVar = this.f15923g;
        if (kVar instanceof b0) {
            b0 b0Var = (b0) kVar;
            synchronized (b0Var.f15902b) {
                surface = b0Var.f15903c;
                b0Var.f15903c = null;
                hashSet = new HashSet(b0Var.f15904d);
                b0Var.f15904d.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        k(9);
        this.f15926k.b(null);
    }

    public final void h() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.f15922f.setParameters(bundle);
    }

    public final void i() {
        com.google.firebase.messaging.o oVar;
        Executor executor;
        this.f15938w = H;
        this.f15939x = 0L;
        this.f15931p.clear();
        this.f15927l.clear();
        Iterator it = this.f15928m.iterator();
        while (it.hasNext()) {
            ((j1.h) it.next()).c();
        }
        this.f15928m.clear();
        com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.reset()");
        this.f15922f.reset();
        this.C = false;
        this.D = false;
        this.E = false;
        this.f15940y = false;
        ScheduledFuture scheduledFuture = this.A;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.A = null;
        }
        ScheduledFuture scheduledFuture2 = this.F;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.F = null;
        }
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f15892j = true;
        }
        this.B = new a0(this);
        com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.setCallback()");
        this.f15922f.setCallback(this.B);
        com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.configure()");
        this.f15922f.configure(this.f15921e, (Surface) null, (MediaCrypto) null, 1);
        k kVar = this.f15923g;
        if (kVar instanceof b0) {
            b0 b0Var = (b0) kVar;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) c1.a.f2187a.i(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (b0Var.f15902b) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (b0Var.f15903c == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            b0Var.f15903c = surfaceCreateInputSurface;
                        }
                        b0Var.f15907g.f15922f.setInputSurface(b0Var.f15903c);
                    } else {
                        Surface surface = b0Var.f15903c;
                        if (surface != null) {
                            b0Var.f15904d.add(surface);
                        }
                        surfaceCreateInputSurface = b0Var.f15907g.f15922f.createInputSurface();
                        b0Var.f15903c = surfaceCreateInputSurface;
                    }
                    oVar = b0Var.f15905e;
                    executor = b0Var.f15906f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (surfaceCreateInputSurface == null || oVar == null || executor == null) {
                return;
            }
            try {
                executor.execute(new y(3, oVar, surfaceCreateInputSurface));
            } catch (RejectedExecutionException e3) {
                com.google.android.gms.internal.auth.g.l(b0Var.f15907g.f15917a, "Unable to post to the supplied executor.", e3);
            }
        }
    }

    public final void j(boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z5 ? 1 : 0);
        com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.setParameters - setMediaCodecPaused: " + z5);
        this.f15922f.setParameters(bundle);
    }

    public final void k(int i) {
        if (this.G == i) {
            return;
        }
        com.google.android.gms.internal.auth.g.e(this.f15917a, "Transitioning encoder internal state: " + om1.E(this.G) + " --> " + om1.E(i));
        this.G = i;
    }

    public final void l() {
        com.google.android.gms.internal.auth.g.e(this.f15917a, "signalCodecStop");
        k kVar = this.f15923g;
        if (kVar instanceof x) {
            ((x) kVar).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f15929n.iterator();
            while (it.hasNext()) {
                arrayList.add(k0.j.f(((t) it.next()).f15991d));
            }
            k0.j.i(arrayList).a(new p(this, 0), this.i);
            return;
        }
        if (kVar instanceof b0) {
            try {
                if (c1.a.f2187a.i(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    a0 a0Var = this.B;
                    j0.i iVar = this.i;
                    ScheduledFuture scheduledFuture = this.F;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.F = hl.d.s().schedule(new a0.d(24, iVar, a0Var), 1000L, TimeUnit.MILLISECONDS);
                }
                com.google.android.gms.internal.auth.g.e(this.f15917a, "mMediaCodec.signalEndOfInputStream()");
                this.f15922f.signalEndOfInputStream();
                this.E = true;
            } catch (MediaCodec.CodecException e3) {
                b(e3.getMessage(), e3, 1);
            }
        }
    }

    public final void m() {
        this.i.execute(new q(this, this.f15933r.i(), 1));
    }

    public final void n(Runnable runnable) {
        String str = this.f15917a;
        com.google.android.gms.internal.auth.g.e(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f15930o;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.j.f(((j) it.next()).f15970f));
        }
        HashSet hashSet2 = this.f15929n;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(k0.j.f(((t) it2.next()).f15991d));
        }
        if (!arrayList.isEmpty()) {
            com.google.android.gms.internal.auth.g.e(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        k0.j.i(arrayList).a(new a1.c(this, arrayList, runnable, 8), this.i);
    }

    public final long o(long j10) {
        if (!c()) {
            return j10;
        }
        return Math.round(this.f15934s.doubleValue() * j10);
    }
}
