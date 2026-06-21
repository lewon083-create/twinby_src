package x0;

import a0.o2;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.y50;
import com.yandex.varioqub.config.model.ConfigValue;
import fj.x0;
import g0.s2;
import g0.t1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements m0 {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Set f35519m0 = Collections.unmodifiableSet(EnumSet.of(a0.f35507c, a0.f35508d));

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Set f35520n0 = Collections.unmodifiableSet(EnumSet.of(a0.f35506b, a0.f35509e, a0.i, a0.f35512h, a0.f35513j));
    public static final k o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e f35521p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final wf.b f35522q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final wf.b f35523r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final j0.i f35524s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f35525t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final long f35526u0;
    public s2 A;
    public Surface B;
    public Surface C;
    public MediaMuxer D;
    public final b4.d E;
    public a1.g F;
    public e1.c0 G;
    public a0.a0 H;
    public e1.c0 I;
    public a0.a0 J;
    public Uri K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public e1.i V;
    public final la.m W;
    public Throwable X;
    public boolean Y;
    public ScheduledFuture Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.d f35527a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f35528a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.d f35529b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public y50 f35530b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f35531c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e1.d f35532c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.i f35533d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public y50 f35534d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wf.b f35535e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public double f35536e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wf.b f35537f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f35538f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.b f35539g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public k6.o f35540g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f35541h = new Object();
    public xi.d h0;
    public final boolean i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f35542i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f35543j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f35544j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b4.d f35545k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f35546k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a0 f35547l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f35548l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a0 f35549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f35551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f35552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f35553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f35554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0.m f35556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a0.m f35557u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z0.a f35558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f35559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f35560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f35561y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o2 f35562z;

    static {
        p pVar = k.f35627f;
        com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
        if (pVar == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        yVar.f14899b = pVar;
        yVar.f14900c = 0;
        Range range = k.f35626e;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        yVar.f14901d = range;
        yVar.f14902e = -1;
        yVar.f14899b = pVar;
        yVar.f14902e = -1;
        k kVarB = yVar.b();
        o0 = kVarB;
        a aVarC = a.a().c();
        com.google.firebase.messaging.y yVar2 = new com.google.firebase.messaging.y();
        yVar2.f14899b = pVar;
        yVar2.f14900c = 0;
        yVar2.f14901d = range;
        yVar2.f14902e = -1;
        yVar2.b();
        f35521p0 = new e(kVarB, aVarC, -1);
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f35522q0 = new wf.b(13);
        f35523r0 = new wf.b(14);
        f35524s0 = new j0.i(hl.d.o());
        f35525t0 = 3;
        f35526u0 = 1000L;
    }

    public b0(e eVar, wf.b bVar, wf.b bVar2, wf.b bVar3) {
        this.i = c1.a.f2187a.i(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f35545k = new b4.d(null);
        this.f35547l = a0.f35506b;
        this.f35549m = null;
        this.f35550n = 0;
        this.f35551o = null;
        this.f35552p = null;
        this.f35553q = 0L;
        this.f35554r = null;
        this.f35555s = false;
        this.f35556t = null;
        this.f35557u = null;
        this.f35558v = null;
        this.f35559w = new ArrayList();
        this.f35560x = null;
        this.f35561y = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.f35546k0 = 1;
        this.K = Uri.EMPTY;
        this.L = 0L;
        this.M = 0L;
        this.N = 0L;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = Long.MAX_VALUE;
        this.R = Long.MAX_VALUE;
        this.S = 0L;
        this.T = 0L;
        this.U = 1;
        this.V = null;
        this.W = new la.m(60, (qg.a) null);
        this.X = null;
        this.Y = false;
        this.f35548l0 = 3;
        this.Z = null;
        this.f35528a0 = false;
        this.f35532c0 = null;
        this.f35534d0 = null;
        this.f35536e0 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f35538f0 = false;
        this.f35540g0 = null;
        this.h0 = null;
        this.f35542i0 = Long.MAX_VALUE;
        this.f35544j0 = false;
        j0.f fVarO = hl.d.o();
        this.f35531c = fVarO;
        j0.i iVar = new j0.i(fVarO);
        this.f35533d = iVar;
        k kVarB = eVar.f35578a;
        a aVar = eVar.f35579b;
        int i = eVar.f35580c;
        if (eVar.f35578a.f35631d == -1) {
            if (kVarB == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
            yVar.f14899b = kVarB.f35628a;
            yVar.f14900c = Integer.valueOf(kVarB.f35629b);
            yVar.f14901d = kVarB.f35630c;
            yVar.f14902e = Integer.valueOf(kVarB.f35631d);
            yVar.f14902e = Integer.valueOf(o0.f35631d);
            kVarB = yVar.b();
        }
        String strConcat = kVarB == null ? " videoSpec" : "";
        strConcat = aVar == null ? strConcat.concat(" audioSpec") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.E = new b4.d(new e(kVarB, aVar, i));
        this.f35527a = new b4.d(new j(this.f35550n, m(this.f35547l), null));
        this.f35529b = new b4.d(Boolean.FALSE);
        this.f35535e = bVar;
        this.f35537f = bVar2;
        this.f35539g = bVar3;
        this.f35530b0 = new y50(bVar, iVar, fVarO);
        this.f35543j = 52428800L;
        com.google.android.gms.internal.auth.g.e("Recorder", "mRequiredFreeStorageBytes = " + hl.d.m(52428800L));
    }

    public static Object l(b4.d dVar) {
        try {
            return dVar.A().get();
        } catch (InterruptedException | ExecutionException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int m(a0 a0Var) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = (DeactivateEncoderSurfaceBeforeStopEncoderQuirk) c1.a.f2187a.i(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class);
        if (a0Var != a0.f35510f) {
            return (a0Var == a0.f35512h && deactivateEncoderSurfaceBeforeStopEncoderQuirk == null) ? 1 : 2;
        }
        return 1;
    }

    public static boolean p(d0 d0Var, h hVar) {
        return hVar != null && d0Var.f35575d == hVar.f35611n;
    }

    public static void r(e1.m mVar) {
        if (mVar instanceof e1.c0) {
            e1.c0 c0Var = (e1.c0) mVar;
            com.google.android.gms.internal.auth.g.e(c0Var.f15917a, "signalSourceStopped");
            c0Var.i.execute(new e1.p(c0Var, 5));
        }
    }

    public final void A(int i) {
        com.google.android.gms.internal.auth.g.e("Recorder", "Transitioning audio state: " + pe.a.x(this.f35546k0) + " --> " + pe.a.x(i));
        this.f35546k0 = i;
    }

    public final void B(a0.m mVar) {
        com.google.android.gms.internal.auth.g.e("Recorder", "Update stream transformation info: " + mVar);
        this.f35556t = mVar;
        synchronized (this.f35541h) {
            this.f35527a.P(new j(this.f35550n, m(this.f35547l), mVar));
        }
    }

    public final void C(Surface surface) {
        int iHashCode;
        if (this.B == surface) {
            return;
        }
        this.B = surface;
        synchronized (this.f35541h) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                iHashCode = 0;
            }
            E(iHashCode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(x0.a0 r4) {
        /*
            r3 = this;
            x0.a0 r0 = r3.f35547l
            if (r0 == r4) goto L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Transitioning Recorder internal state: "
            r0.<init>(r1)
            x0.a0 r1 = r3.f35547l
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            com.google.android.gms.internal.auth.g.e(r1, r0)
            java.util.Set r0 = x0.b0.f35519m0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L5a
            x0.a0 r1 = r3.f35547l
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L61
            java.util.Set r0 = x0.b0.f35520n0
            x0.a0 r1 = r3.f35547l
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L44
            x0.a0 r0 = r3.f35547l
            r3.f35549m = r0
            int r0 = m(r0)
            goto L62
        L44:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            x0.a0 r1 = r3.f35547l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L5a:
            x0.a0 r0 = r3.f35549m
            if (r0 == 0) goto L61
            r0 = 0
            r3.f35549m = r0
        L61:
            r0 = 0
        L62:
            r3.f35547l = r4
            if (r0 != 0) goto L6a
            int r0 = m(r4)
        L6a:
            int r4 = r3.f35550n
            a0.m r1 = r3.f35556t
            x0.j r2 = new x0.j
            r2.<init>(r4, r0, r1)
            b4.d r4 = r3.f35527a
            r4.P(r2)
            return
        L79:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempted to transition to state "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", but Recorder is already in state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b0.D(x0.a0):void");
    }

    public final void E(int i) {
        if (this.f35550n == i) {
            return;
        }
        com.google.android.gms.internal.auth.g.e("Recorder", "Transitioning streamId: " + this.f35550n + " --> " + i);
        this.f35550n = i;
        this.f35527a.P(new j(i, m(this.f35547l), this.f35556t));
    }

    public final void F(h hVar) {
        String message;
        if (this.D != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        boolean zN = n();
        la.m mVar = this.W;
        if (zN && mVar.g()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        e1.i iVar = this.V;
        if (iVar == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.V = null;
            long jB = iVar.B();
            ArrayList arrayList = new ArrayList();
            while (!mVar.g()) {
                e1.i iVar2 = (e1.i) mVar.b();
                if (iVar2.B() >= jB) {
                    arrayList.add(iVar2);
                }
            }
            long size = iVar.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((e1.i) it.next()).size();
            }
            long j10 = this.S;
            int i = 2;
            if (j10 != 0 && size > j10) {
                com.google.android.gms.internal.auth.g.e("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.S)));
                s(hVar, 2, null);
                iVar.close();
                return;
            }
            int i10 = 3;
            try {
                int i11 = ((e) l(this.E)).f35580c;
                if (i11 == -1) {
                    z0.a aVar = this.f35558v;
                    int i12 = f35521p0.f35580c != 1 ? 0 : 1;
                    if (aVar == null) {
                        i = i12;
                    } else {
                        int i13 = aVar.f45777b;
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 9) {
                                    i = i12;
                                }
                                i = 1;
                            }
                        } else if (Build.VERSION.SDK_INT < 26) {
                        }
                        i = 0;
                    }
                } else {
                    if (i11 != 1) {
                        i = 0;
                    }
                    i = 1;
                }
                MediaMuxer mediaMuxerH = hVar.h(i, new f7.i(3, this));
                a0.m mVar2 = this.f35557u;
                if (mVar2 != null) {
                    B(mVar2);
                    mediaMuxerH.setOrientationHint(mVar2.f163b);
                }
                d dVar = hVar.i.f35648a;
                this.f35561y = Integer.valueOf(mediaMuxerH.addTrack((MediaFormat) this.H.f13c));
                if (n()) {
                    this.f35560x = Integer.valueOf(mediaMuxerH.addTrack((MediaFormat) this.J.f13c));
                }
                try {
                    mediaMuxerH.start();
                    this.D = mediaMuxerH;
                    N(iVar, hVar);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        M((e1.i) it2.next(), hVar);
                    }
                    iVar.close();
                } catch (IllegalStateException e3) {
                    xi.d dVar2 = this.h0;
                    dVar2.getClass();
                    if (dVar2.i() >= this.f35543j) {
                        i10 = 1;
                    }
                    s(hVar, i10, e3);
                    iVar.close();
                }
            } catch (IOException e7) {
                Intrinsics.checkNotNullParameter(e7, "e");
                if (!(e7 instanceof FileNotFoundException) || (message = e7.getMessage()) == null || !StringsKt.y(message, "No space left on device", false)) {
                    i10 = 5;
                }
                s(hVar, i10, e7);
                iVar.close();
            }
        } catch (Throwable th2) {
            try {
                iVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void G(h hVar) {
        int i;
        g0.h hVar2;
        String str;
        e eVar = (e) l(this.E);
        z0.a aVar = this.f35558v;
        int i10 = eVar.f35580c;
        String str2 = i10 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i11 = (i10 != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (aVar == null || (hVar2 = aVar.f45780e) == null) {
            i = i11;
            hVar2 = null;
            str = str2;
        } else {
            str = hVar2.f19572b;
            i = hVar2.f19576f;
            if (Objects.equals(str, "audio/none")) {
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + str2 + "(profile: " + i11 + ")]");
            } else if (i10 == -1) {
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + str + "(profile: " + i + ")]");
            } else if (str2.equals(str) && i11 == i) {
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + str + "(profile: " + i11 + ")]");
                i = i11;
            } else {
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + str + "(profile: " + i + "), chosen mime type: " + str2 + "(profile: " + i11 + ")]");
            }
            i = i11;
            hVar2 = null;
            str = str2;
        }
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        g0.h hVar3 = hVar2 != null ? hVar2 : null;
        e1.d dVar = this.f35532c0;
        dVar.getClass();
        int i12 = dVar.f15949h;
        int i13 = dVar.f15948g;
        Rational rational = i13 != i12 ? new Rational(i13, i12) : null;
        a aVar2 = eVar.f35579b;
        a1.n nVar = (a1.n) (hVar3 != null ? new ka.k(aVar2, hVar3, rational, 8) : new a1.e(7, aVar2, rational, false)).get();
        if (this.F != null) {
            u();
        }
        if (!hVar.f35609l) {
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + hVar);
        }
        z zVar = (z) hVar.f35603e.getAndSet(null);
        if (zVar == null) {
            throw new AssertionError("One-time audio source creation has already occurred for recording " + hVar);
        }
        a1.g gVarA = zVar.a(nVar, f35524s0);
        this.F = gVarA;
        com.google.android.gms.internal.auth.g.e("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(gVarA.hashCode())));
        a aVar3 = eVar.f35579b;
        e1.b bVar = (e1.b) (hVar3 != null ? new d1.b(str, i, aVar3, nVar, hVar3) : new la.m(str, i, aVar3, nVar)).get();
        o2 o2Var = this.f35562z;
        o2Var.getClass();
        int i14 = o2Var.f184g;
        this.f35537f.getClass();
        e1.c0 c0Var = new e1.c0(this.f35531c, bVar, i14);
        this.I = c0Var;
        e1.k kVar = c0Var.f15923g;
        if (!(kVar instanceof e1.x)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        a1.g gVar = this.F;
        gVar.f326a.execute(new a0.d(6, gVar, (e1.x) kVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(x0.h r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b0.H(x0.h, boolean):void");
    }

    public final void I(h hVar, final long j10, int i, Throwable th2) throws Exception {
        if (this.f35554r != hVar || this.f35555s) {
            return;
        }
        this.f35555s = true;
        this.U = i;
        if (n()) {
            while (true) {
                la.m mVar = this.W;
                if (mVar.g()) {
                    break;
                } else {
                    mVar.b();
                }
            }
            final e1.c0 c0Var = this.I;
            final long jI = c0Var.f15933r.i();
            c0Var.i.execute(new Runnable() { // from class: e1.s
                @Override // java.lang.Runnable
                public final void run() {
                    c0 c0Var2 = c0Var;
                    String str = c0Var2.f15917a;
                    switch (t.z.m(c0Var2.G)) {
                        case 0:
                        case 3:
                        case 7:
                            return;
                        case 1:
                        case 2:
                            int i10 = c0Var2.G;
                            c0Var2.k(4);
                            Long l10 = (Long) c0Var2.f15938w.getLower();
                            long jLongValue = l10.longValue();
                            if (jLongValue == Long.MAX_VALUE) {
                                throw new AssertionError("There should be a \"start\" before \"stop\"");
                            }
                            long j11 = j10;
                            if (j11 == -1) {
                                j11 = jI;
                            } else if (j11 < jLongValue) {
                                com.google.android.gms.internal.auth.g.O(str, "The expected stop time is less than the start time. Use current time as stop time.");
                                j11 = jI;
                            }
                            if (j11 < jLongValue) {
                                throw new AssertionError("The start time should be before the stop time.");
                            }
                            c0Var2.f15938w = Range.create(l10, Long.valueOf(j11));
                            com.google.android.gms.internal.auth.g.e(str, "Stop on ".concat(a0.e.m(j11)));
                            if (i10 == 3 && c0Var2.f15941z != null) {
                                c0Var2.l();
                                return;
                            } else {
                                c0Var2.f15940y = true;
                                c0Var2.A = hl.d.s().schedule(new p(c0Var2, 1), 1000L, TimeUnit.MILLISECONDS);
                                return;
                            }
                        case 4:
                        case 5:
                            c0Var2.k(1);
                            return;
                        case 6:
                        case 8:
                            throw new IllegalStateException("Encoder is released");
                        default:
                            throw new IllegalStateException("Unknown state: ".concat(om1.E(c0Var2.G)));
                    }
                }
            });
        }
        e1.i iVar = this.V;
        if (iVar != null) {
            iVar.close();
            this.V = null;
        }
        if (this.f35548l0 != 2) {
            t.a0 a0Var = new t.a0(11, this.G);
            this.Z = hl.d.s().schedule(new v0(14, this.f35533d, a0Var), 1000L, TimeUnit.MILLISECONDS);
        } else {
            r(this.G);
        }
        final e1.c0 c0Var2 = this.G;
        final long jI2 = c0Var2.f15933r.i();
        c0Var2.i.execute(new Runnable() { // from class: e1.s
            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var22 = c0Var2;
                String str = c0Var22.f15917a;
                switch (t.z.m(c0Var22.G)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i10 = c0Var22.G;
                        c0Var22.k(4);
                        Long l10 = (Long) c0Var22.f15938w.getLower();
                        long jLongValue = l10.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j11 = j10;
                        if (j11 == -1) {
                            j11 = jI2;
                        } else if (j11 < jLongValue) {
                            com.google.android.gms.internal.auth.g.O(str, "The expected stop time is less than the start time. Use current time as stop time.");
                            j11 = jI2;
                        }
                        if (j11 < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        c0Var22.f15938w = Range.create(l10, Long.valueOf(j11));
                        com.google.android.gms.internal.auth.g.e(str, "Stop on ".concat(a0.e.m(j11)));
                        if (i10 == 3 && c0Var22.f15941z != null) {
                            c0Var22.l();
                            return;
                        } else {
                            c0Var22.f15940y = true;
                            c0Var22.A = hl.d.s().schedule(new p(c0Var22, 1), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        c0Var22.k(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(om1.E(c0Var22.G)));
                }
            }
        });
    }

    public final void J(final h hVar, boolean z5) {
        ArrayList arrayList = this.f35559w;
        if (!arrayList.isEmpty()) {
            k0.m mVarB = k0.j.b(arrayList);
            if (!mVarB.isDone()) {
                mVarB.cancel(true);
            }
            arrayList.clear();
        }
        final int i = 0;
        arrayList.add(i0.o.w(new j1.i(this) { // from class: x0.u

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b0 f35677c;

            {
                this.f35677c = this;
            }

            @Override // j1.i
            public final Object m(j1.h hVar2) {
                switch (i) {
                    case 0:
                        b0 b0Var = this.f35677c;
                        h hVar3 = hVar;
                        e1.c0 c0Var = b0Var.G;
                        bb.e eVar = new bb.e(28, b0Var, hVar2, hVar3, false);
                        j0.i iVar = b0Var.f35533d;
                        synchronized (c0Var.f15918b) {
                            c0Var.f15936u = eVar;
                            c0Var.f15937v = iVar;
                            break;
                        }
                        return "videoEncodingFuture";
                    default:
                        b0 b0Var2 = this.f35677c;
                        h hVar4 = hVar;
                        i7.h hVar5 = new i7.h(4, b0Var2, hVar2);
                        a1.g gVar = b0Var2.F;
                        j0.i iVar2 = b0Var2.f35533d;
                        gVar.f326a.execute(new a1.c(gVar, iVar2, new v(0, b0Var2, hVar5), 0));
                        e1.c0 c0Var2 = b0Var2.I;
                        s7.g gVar2 = new s7.g();
                        gVar2.f32798e = b0Var2;
                        gVar2.f32795b = hVar2;
                        gVar2.f32796c = hVar5;
                        gVar2.f32797d = hVar4;
                        synchronized (c0Var2.f15918b) {
                            c0Var2.f15936u = gVar2;
                            c0Var2.f15937v = iVar2;
                            break;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (n() && !z5) {
            final int i10 = 1;
            arrayList.add(i0.o.w(new j1.i(this) { // from class: x0.u

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b0 f35677c;

                {
                    this.f35677c = this;
                }

                @Override // j1.i
                public final Object m(j1.h hVar2) {
                    switch (i10) {
                        case 0:
                            b0 b0Var = this.f35677c;
                            h hVar3 = hVar;
                            e1.c0 c0Var = b0Var.G;
                            bb.e eVar = new bb.e(28, b0Var, hVar2, hVar3, false);
                            j0.i iVar = b0Var.f35533d;
                            synchronized (c0Var.f15918b) {
                                c0Var.f15936u = eVar;
                                c0Var.f15937v = iVar;
                                break;
                            }
                            return "videoEncodingFuture";
                        default:
                            b0 b0Var2 = this.f35677c;
                            h hVar4 = hVar;
                            i7.h hVar5 = new i7.h(4, b0Var2, hVar2);
                            a1.g gVar = b0Var2.F;
                            j0.i iVar2 = b0Var2.f35533d;
                            gVar.f326a.execute(new a1.c(gVar, iVar2, new v(0, b0Var2, hVar5), 0));
                            e1.c0 c0Var2 = b0Var2.I;
                            s7.g gVar2 = new s7.g();
                            gVar2.f32798e = b0Var2;
                            gVar2.f32795b = hVar2;
                            gVar2.f32796c = hVar5;
                            gVar2.f32797d = hVar4;
                            synchronized (c0Var2.f15918b) {
                                c0Var2.f15936u = gVar2;
                                c0Var2.f15937v = iVar2;
                                break;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        k0.j.a(k0.j.b(arrayList), new ni.i(22, this), hl.d.j());
    }

    public final void K(boolean z5) {
        h hVar = this.f35554r;
        if (hVar != null) {
            hVar.i(new r0(hVar.i, k()), z5);
        }
    }

    public final void L(a0 a0Var) {
        if (!f35519m0.contains(this.f35547l)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f35547l);
        }
        if (!f35520n0.contains(a0Var)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + a0Var);
        }
        if (this.f35549m != a0Var) {
            this.f35549m = a0Var;
            this.f35527a.P(new j(this.f35550n, m(a0Var), this.f35556t));
        }
    }

    public final void M(e1.i iVar, h hVar) {
        long size = iVar.size() + this.L;
        long j10 = this.S;
        if (j10 != 0 && size > j10) {
            com.google.android.gms.internal.auth.g.e("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.S)));
            s(hVar, 2, null);
            return;
        }
        long jB = iVar.B();
        long j11 = this.P;
        if (j11 == Long.MAX_VALUE) {
            this.P = jB;
            com.google.android.gms.internal.auth.g.e("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jB), a0.e.m(this.P)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jB - Math.min(this.O, j11));
            f2.g.h("There should be a previous data for adjusting the duration.", this.R != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jB - this.R) + nanos;
            long j12 = this.T;
            if (j12 != 0 && nanos2 > j12) {
                com.google.android.gms.internal.auth.g.e("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.T)));
                s(hVar, 9, null);
                return;
            }
        }
        try {
            this.D.writeSampleData(this.f35560x.intValue(), iVar.y(), iVar.p());
            this.L = size;
            this.M = iVar.size() + this.M;
            this.R = jB;
        } catch (IllegalStateException e3) {
            xi.d dVar = this.h0;
            dVar.getClass();
            s(hVar, dVar.i() < this.f35543j ? 3 : 1, e3);
        }
    }

    public final void N(e1.i iVar, h hVar) {
        String str;
        long j10 = this.f35543j;
        if (this.f35561y == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = iVar.size() + this.L;
        long j11 = this.S;
        long nanos = 0;
        if (j11 != 0 && size > j11) {
            com.google.android.gms.internal.auth.g.e("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.S)));
            s(hVar, 2, null);
            return;
        }
        long jB = iVar.B();
        long j12 = this.O;
        if (j12 == Long.MAX_VALUE) {
            this.O = jB;
            com.google.android.gms.internal.auth.g.e("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jB), a0.e.m(this.O)));
            str = "Recorder";
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jB - Math.min(j12, this.P));
            f2.g.h("There should be a previous data for adjusting the duration.", this.Q != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jB - this.Q) + nanos;
            str = "Recorder";
            long j13 = this.T;
            if (j13 != 0 && nanos2 > j13) {
                com.google.android.gms.internal.auth.g.e(str, String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.T)));
                s(hVar, 9, null);
                return;
            }
        }
        try {
            this.D.writeSampleData(this.f35561y.intValue(), iVar.y(), iVar.p());
            this.L = size;
            this.N = nanos;
            this.Q = jB;
            K(iVar.r());
            if (size > this.f35542i0) {
                xi.d dVar = this.h0;
                dVar.getClass();
                long jI = dVar.i();
                com.google.android.gms.internal.auth.g.e(str, "availableBytes = " + hl.d.m(jI));
                if (jI < j10) {
                    s(hVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jI), Long.valueOf(j10))));
                } else {
                    this.f35542i0 = jI - j10;
                }
            }
        } catch (IllegalStateException e3) {
            xi.d dVar2 = this.h0;
            dVar2.getClass();
            s(hVar, dVar2.i() >= j10 ? 1 : 3, e3);
        }
    }

    @Override // x0.m0
    public final void a(o2 o2Var) {
        b(o2Var, s2.f19753b, false);
    }

    @Override // x0.m0
    public final void b(o2 o2Var, s2 s2Var, boolean z5) {
        synchronized (this.f35541h) {
            try {
                com.google.android.gms.internal.auth.g.e("Recorder", "Surface is requested in state: " + this.f35547l + ", Current surface: " + this.f35550n);
                if (this.f35547l == a0.f35513j) {
                    D(a0.f35506b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35533d.execute(new x0(2, this, o2Var, s2Var, z5));
    }

    @Override // x0.m0
    public final f0 c(g0.d0 d0Var, int i) {
        return new c0(d0Var, i == 1 ? 2 : 1);
    }

    @Override // x0.m0
    public final t1 d() {
        return this.E;
    }

    @Override // x0.m0
    public final void e(int i) {
        this.f35533d.execute(new a1.q(this, i, 10));
    }

    @Override // x0.m0
    public final t1 f() {
        return this.f35527a;
    }

    @Override // x0.m0
    public final t1 g() {
        return this.f35529b;
    }

    public final void h(o2 o2Var, s2 s2Var, boolean z5) {
        Object value;
        g gVar;
        if (o2Var.a()) {
            com.google.android.gms.internal.auth.g.O("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        q qVar = new q(this);
        j0.i iVar = this.f35533d;
        o2Var.c(iVar, qVar);
        Size size = o2Var.f179b;
        a0.i0 i0Var = o2Var.f180c;
        c0 c0Var = (c0) c(o2Var.f182e.b(), o2Var.f184g);
        l lVarE = c0Var.e(i0Var);
        if (lVarE == null) {
            gVar = g.f35589k;
        } else {
            TreeMap treeMap = lVarE.f35643b;
            Size size2 = p0.b.f30754a;
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            gVar = (g) value;
            if (gVar == null) {
                gVar = g.f35589k;
            }
        }
        com.google.android.gms.internal.auth.g.e("Recorder", "Using supported quality of " + gVar + " for surface size " + size);
        if (gVar != g.f35589k) {
            l lVarE2 = c0Var.e(i0Var);
            z0.a aVarA = lVarE2 == null ? null : lVarE2.a(gVar);
            this.f35558v = aVarA;
            if (aVarA == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        com.google.android.gms.internal.auth.g.e("Recorder", "mResolvedEncoderProfiles = " + this.f35558v);
        k6.o oVar = this.f35540g0;
        if (oVar != null && !oVar.f27141b) {
            oVar.f27141b = true;
            ScheduledFuture scheduledFuture = (ScheduledFuture) oVar.f27145f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                oVar.f27145f = null;
            }
        }
        k6.o oVar2 = new k6.o(this, o2Var, s2Var, this.f35544j0, z5 ? f35525t0 : 0);
        this.f35540g0 = oVar2;
        z().a(new q0.o(oVar2, o2Var, s2Var, 13), iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0178 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:43:0x00f2, B:45:0x00f6, B:46:0x00fa, B:54:0x0120, B:55:0x0128, B:94:0x01b2, B:59:0x0133, B:61:0x0137, B:63:0x013d, B:69:0x0148, B:71:0x0153, B:74:0x015d, B:75:0x0170, B:78:0x0174, B:80:0x0178, B:81:0x0185, B:83:0x0189, B:85:0x018f, B:89:0x0197, B:90:0x019f, B:92:0x01a3, B:109:0x01dc, B:110:0x01dd, B:111:0x01e4, B:47:0x00fb, B:48:0x010c, B:50:0x0112, B:53:0x011f), top: B:116:0x00f2, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:43:0x00f2, B:45:0x00f6, B:46:0x00fa, B:54:0x0120, B:55:0x0128, B:94:0x01b2, B:59:0x0133, B:61:0x0137, B:63:0x013d, B:69:0x0148, B:71:0x0153, B:74:0x015d, B:75:0x0170, B:78:0x0174, B:80:0x0178, B:81:0x0185, B:83:0x0189, B:85:0x018f, B:89:0x0197, B:90:0x019f, B:92:0x01a3, B:109:0x01dc, B:110:0x01dd, B:111:0x01e4, B:47:0x00fb, B:48:0x010c, B:50:0x0112, B:53:0x011f), top: B:116:0x00f2, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r12) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b0.i(int):void");
    }

    public final void j(h hVar, int i) {
        Uri uri = Uri.EMPTY;
        hVar.a(uri);
        m mVar = hVar.i;
        i iVarA = i.a(0L, 0L, new b(1, ConfigValue.DOUBLE_DEFAULT_VALUE, 0L, this.X));
        f2.g.g(uri, "OutputUri cannot be null.");
        f2.g.a("An error type is required.", i != 0);
        hVar.i(new n0(mVar, iVarA, i), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[PHI: r6
      0x0039: PHI (r6v1 int) = (r6v0 int), (r6v0 int), (r6v0 int), (r6v3 int), (r6v2 int) binds: [B:3:0x000b, B:4:0x000d, B:6:0x0010, B:23:0x0040, B:18:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x0.i k() {
        /*
            r14 = this;
            long r0 = r14.N
            long r2 = r14.L
            int r4 = r14.f35546k0
            int r5 = t.z.m(r4)
            r6 = 1
            if (r5 == 0) goto L39
            if (r5 == r6) goto L39
            r7 = 2
            if (r5 == r7) goto L39
            r6 = 5
            r8 = 3
            if (r5 == r8) goto L2d
            r7 = 4
            if (r5 == r7) goto L42
            if (r5 != r6) goto L1d
        L1b:
            r8 = r7
            goto L42
        L1d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = pe.a.x(r4)
            java.lang.String r2 = "Invalid internal audio state: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L2d:
            x0.h r4 = r14.f35554r
            if (r4 == 0) goto L3b
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f35605g
            boolean r4 = r4.get()
            if (r4 == 0) goto L3b
        L39:
            r8 = r6
            goto L42
        L3b:
            boolean r4 = r14.Y
            if (r4 == 0) goto L40
            goto L1b
        L40:
            r6 = 0
            goto L39
        L42:
            java.lang.Throwable r13 = r14.X
            double r9 = r14.f35536e0
            long r11 = r14.M
            x0.b r7 = new x0.b
            r7.<init>(r8, r9, r11, r13)
            x0.i r0 = x0.i.a(r0, r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b0.k():x0.i");
    }

    public final boolean n() {
        return this.f35546k0 == 4;
    }

    public final boolean o() {
        h hVar = this.f35554r;
        return hVar != null && hVar.f35610m;
    }

    public final h q(a0 a0Var) {
        boolean z5;
        if (a0Var == a0.f35508d) {
            z5 = true;
        } else {
            if (a0Var != a0.f35507c) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z5 = false;
        }
        if (this.f35551o != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        h hVar = this.f35552p;
        if (hVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f35551o = hVar;
        hVar.f35606h.J(hl.d.j(), new g0.h0(2, this));
        this.f35552p = null;
        if (z5) {
            D(a0.f35511g);
            return hVar;
        }
        D(a0.f35510f);
        return hVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(x0.h r11, int r12, java.lang.Exception r13) {
        /*
            r10 = this;
            java.lang.String r0 = "In-progress recording error occurred while in unexpected state: "
            x0.h r1 = r10.f35554r
            if (r11 != r1) goto L58
            java.lang.Object r1 = r10.f35541h
            monitor-enter(r1)
            x0.a0 r2 = r10.f35547l     // Catch: java.lang.Throwable -> L32
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L32
            r3 = 0
            switch(r2) {
                case 0: goto L41;
                case 1: goto L1f;
                case 2: goto L1f;
                case 3: goto L41;
                case 4: goto L14;
                case 5: goto L14;
                case 6: goto L1f;
                case 7: goto L1f;
                case 8: goto L41;
                default: goto L13;
            }
        L13:
            goto L23
        L14:
            x0.a0 r0 = x0.a0.f35512h     // Catch: java.lang.Throwable -> L1b
            r10.D(r0)     // Catch: java.lang.Throwable -> L1b
            r3 = 1
            goto L1f
        L1b:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L56
        L1f:
            x0.h r0 = r10.f35551o     // Catch: java.lang.Throwable -> L32
            if (r11 != r0) goto L36
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L30
            r6 = -1
            r4 = r10
            r5 = r11
            r8 = r12
            r9 = r13
            r4.I(r5, r6, r8, r9)
            return
        L30:
            r4 = r10
            return
        L32:
            r0 = move-exception
            r4 = r10
        L34:
            r11 = r0
            goto L56
        L36:
            r4 = r10
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3f
            java.lang.String r12 = "Internal error occurred for recording but it is not the active recording."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3f
            throw r11     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            goto L34
        L41:
            r4 = r10
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            x0.a0 r13 = r4.f35547l     // Catch: java.lang.Throwable -> L3f
            r12.append(r13)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L3f
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3f
            throw r11     // Catch: java.lang.Throwable -> L3f
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r11
        L58:
            r4 = r10
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r12 = "Internal error occurred on recording that is not the current in-progress recording."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b0.s(x0.h, int, java.lang.Exception):void");
    }

    public final void t(h hVar) {
        if (this.f35554r != hVar || this.f35555s) {
            return;
        }
        if (n()) {
            this.I.f();
        }
        this.G.f();
        h hVar2 = this.f35554r;
        hVar2.i(new o0(hVar2.i, k()), true);
    }

    public final void u() {
        a1.g gVar = this.F;
        if (gVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.F = null;
        com.google.android.gms.internal.auth.g.e("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(gVar.hashCode())));
        k0.j.a(i0.o.w(new a0.a0(2, gVar)), new a1.f(gVar), hl.d.j());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void v(boolean z5) {
        boolean z10;
        boolean z11;
        synchronized (this.f35541h) {
            try {
                z10 = true;
                z11 = false;
                switch (this.f35547l.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        L(a0.i);
                        break;
                    case 4:
                    case 5:
                        f2.g.h("In-progress recording shouldn't be null when in state " + this.f35547l, this.f35554r != null);
                        if (this.f35551o != this.f35554r) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!o()) {
                            D(a0.i);
                            z11 = true;
                            z10 = false;
                        }
                        break;
                        break;
                    case 6:
                        D(a0.i);
                        z10 = false;
                        break;
                    case 7:
                    default:
                        z10 = false;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            if (z11) {
                I(this.f35554r, -1L, 4, null);
            }
        } else if (z5) {
            x();
        } else {
            w();
        }
    }

    public final void w() {
        if (this.I != null) {
            com.google.android.gms.internal.auth.g.e("Recorder", "Releasing audio encoder.");
            e1.c0 c0Var = this.I;
            c0Var.i.execute(new e1.p(c0Var, 4));
            this.I = null;
            this.J = null;
        }
        if (this.F != null) {
            u();
        }
        A(1);
        x();
    }

    public final void x() {
        o2 o2Var;
        boolean z5 = true;
        if (this.G != null) {
            com.google.android.gms.internal.auth.g.e("Recorder", "Releasing video encoder.");
            y50 y50Var = this.f35534d0;
            if (y50Var != null) {
                f2.g.h(null, ((e1.c0) y50Var.f12505f) == this.G);
                com.google.android.gms.internal.auth.g.e("Recorder", "Releasing video encoder: " + this.G);
                this.f35534d0.l();
                this.f35534d0 = null;
                this.G = null;
                this.H = null;
                C(null);
            } else {
                z();
            }
        }
        synchronized (this.f35541h) {
            try {
                switch (this.f35547l.ordinal()) {
                    case 1:
                    case 2:
                        L(a0.f35506b);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z5 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        D(a0.f35506b);
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35528a0 = false;
        if (!z5 || (o2Var = this.f35562z) == null || o2Var.a()) {
            return;
        }
        h(this.f35562z, this.A, false);
    }

    public final void y() {
        if (f35519m0.contains(this.f35547l)) {
            D(this.f35549m);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.f35547l);
        }
    }

    public final ed.d z() {
        com.google.android.gms.internal.auth.g.e("Recorder", "Try to safely release video encoder: " + this.G);
        y50 y50Var = this.f35530b0;
        y50Var.a();
        return k0.j.f((ed.d) y50Var.f12509k);
    }
}
