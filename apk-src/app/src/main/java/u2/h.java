package u2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.pf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final Object i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile h f34028j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f34029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1.f f34030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f34031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f34032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oa.k f34033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f34034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f34036h;

    public h(m mVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f34029a = reentrantReadWriteLock;
        this.f34031c = 3;
        g gVar = mVar.f34053a;
        this.f34034f = gVar;
        int i10 = mVar.f34054b;
        this.f34035g = i10;
        this.f34036h = mVar.f34055c;
        this.f34032d = new Handler(Looper.getMainLooper());
        this.f34030b = new h1.f(0);
        oa.k kVar = new oa.k(this);
        this.f34033e = kVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f34031c = 0;
            } catch (Throwable th2) {
                this.f34029a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new d(kVar));
            } catch (Throwable th3) {
                d(th3);
            }
        }
    }

    public static h a() {
        h hVar;
        synchronized (i) {
            hVar = f34028j;
            f2.g.h("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", hVar != null);
        }
        return hVar;
    }

    public final int b() {
        this.f34029a.readLock().lock();
        try {
            return this.f34031c;
        } finally {
            this.f34029a.readLock().unlock();
        }
    }

    public final void c() {
        f2.g.h("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f34035g == 1);
        if (b() == 1) {
            return;
        }
        this.f34029a.writeLock().lock();
        try {
            if (this.f34031c == 0) {
                return;
            }
            this.f34031c = 0;
            this.f34029a.writeLock().unlock();
            oa.k kVar = this.f34033e;
            h hVar = (h) kVar.f29858a;
            try {
                hVar.f34034f.a(new d(kVar));
            } catch (Throwable th2) {
                hVar.d(th2);
            }
        } finally {
            this.f34029a.writeLock().unlock();
        }
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f34029a.writeLock().lock();
        try {
            this.f34031c = 2;
            arrayList.addAll(this.f34030b);
            this.f34030b.clear();
            this.f34029a.writeLock().unlock();
            this.f34032d.post(new pf(arrayList, this.f34031c, th2));
        } catch (Throwable th3) {
            this.f34029a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0099 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:32:0x005f, B:35:0x0064, B:37:0x0068, B:39:0x0075, B:44:0x0088, B:46:0x0092, B:48:0x0095, B:50:0x0099, B:52:0x00a9, B:53:0x00ac, B:55:0x00b9, B:58:0x00c1, B:63:0x00e0, B:69:0x00ec, B:72:0x00fa, B:73:0x0104, B:74:0x0115, B:76:0x011c, B:77:0x0121, B:79:0x012c, B:81:0x0133, B:83:0x0137, B:85:0x013f, B:87:0x0143, B:90:0x014b, B:93:0x0159, B:94:0x015e, B:96:0x016e, B:42:0x007e), top: B:113:0x005f }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x00dc
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.h.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(f fVar) {
        f2.g.g(fVar, "initCallback cannot be null");
        this.f34029a.writeLock().lock();
        try {
            if (this.f34031c == 1 || this.f34031c == 2) {
                this.f34032d.post(new pf(Arrays.asList(fVar), this.f34031c, (Throwable) null));
            } else {
                this.f34030b.add(fVar);
            }
            this.f34029a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f34029a.writeLock().unlock();
            throw th2;
        }
    }
}
