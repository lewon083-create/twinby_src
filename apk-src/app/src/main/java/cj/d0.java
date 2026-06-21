package cj;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import com.google.android.gms.internal.ads.om1;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.sentry.protocol.SdkVersion;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import ti.w0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class d0 implements ei.b, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a1.m f2309c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LongSparseArray f2308b = new LongSparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd.b f2310d = new fd.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2311e = 1;

    public static x e(f fVar) {
        String str = fVar.f2320a;
        if (str.startsWith("asset:")) {
            if (str.startsWith("asset:///")) {
                return new l(str, 0);
            }
            throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
        }
        if (str.startsWith("rtsp:")) {
            if (str.startsWith("rtsp://")) {
                return new l(str, 1);
            }
            throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
        }
        r rVar = fVar.f2321b;
        int i = 1;
        if (rVar != null) {
            int iOrdinal = rVar.ordinal();
            if (iOrdinal == 0) {
                i = 3;
            } else if (iOrdinal == 1) {
                i = 4;
            } else if (iOrdinal == 2) {
                i = 2;
            }
        }
        return new i(str, i, new HashMap(fVar.f2322c), fVar.f2323d);
    }

    public final long a(f fVar) {
        x xVarE = e(fVar);
        long j10 = this.f2311e;
        this.f2311e = 1 + j10;
        String string = Long.toString(j10);
        a1.m mVar = this.f2309c;
        Context context = (Context) mVar.f362b;
        dj.e eVar = new dj.e(fe.c.u((ii.f) mVar.f363c, string), xVarE.a(), this.f2310d, null, new dj.d(context, xVarE, 0));
        ii.f fVar2 = (ii.f) this.f2309c.f363c;
        String string2 = Long.toString(j10);
        b0.y1.getClass();
        a0.b(fVar2, eVar, string2);
        eVar.f2367d = new a0.y(4, fVar2, string2);
        this.f2308b.put(j10, eVar);
        return j10;
    }

    public final w b(f fVar) {
        x xVarE = e(fVar);
        long j10 = this.f2311e;
        this.f2311e = 1 + j10;
        String string = Long.toString(j10);
        io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) this.f2309c.f366f;
        jVar.getClass();
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(1);
        a1.m mVar = this.f2309c;
        ej.b bVar = new ej.b(fe.c.u((ii.f) mVar.f363c, string), xVarE.a(), this.f2310d, textureRegistry$SurfaceProducerD, new dj.d((Context) mVar.f362b, xVarE, 1));
        bVar.f16388g = true;
        textureRegistry$SurfaceProducerD.setCallback(bVar);
        Surface surface = textureRegistry$SurfaceProducerD.getSurface();
        ((s3.y) bVar.f2368e).f0(surface);
        bVar.f16388g = surface == null;
        ii.f fVar2 = (ii.f) this.f2309c.f363c;
        String string2 = Long.toString(j10);
        b0.y1.getClass();
        a0.b(fVar2, bVar, string2);
        bVar.f2367d = new a0.y(4, fVar2, string2);
        this.f2308b.put(j10, bVar);
        return new w(j10, textureRegistry$SurfaceProducerD.id());
    }

    public final void c(long j10) {
        LongSparseArray longSparseArray = this.f2308b;
        y yVar = (y) longSparseArray.get(j10);
        if (yVar != null) {
            yVar.b();
            longSparseArray.remove(j10);
            return;
        }
        String strX = "No player found with playerId <" + j10 + ">";
        if (longSparseArray.size() == 0) {
            strX = om1.x(strX, " and no active players created by the plugin.");
        }
        throw new IllegalStateException(strX);
    }

    public final String d(String str, String str2) {
        if (str2 == null) {
            return ((c0) this.f2309c.f364d).f2306a.b(str);
        }
        ci.e eVar = ((c0) this.f2309c.f365e).f2306a;
        StringBuilder sb2 = new StringBuilder(SdkVersion.JsonKeys.PACKAGES);
        String str3 = File.separator;
        return eVar.b(om1.n(sb2, str3, str2, str3, str));
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        u7.f fVarQ = u7.f.q();
        Context context = aVar.f16381a;
        ii.f fVar = aVar.f16383c;
        ci.e eVar = (ci.e) fVarQ.f34322c;
        this.f2309c = new a1.m(context, fVar, new c0(eVar), new c0(eVar), aVar.f16384d);
        c.f2305x1.getClass();
        b.b(fVar, this);
        io.flutter.plugin.platform.n nVar = aVar.f16385e;
        LongSparseArray longSparseArray = this.f2308b;
        Objects.requireNonNull(longSparseArray);
        nVar.h("plugins.flutter.dev/video_player_android", new w0(new a0.a0(4, longSparseArray)));
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        if (this.f2309c == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        a1.m mVar = this.f2309c;
        ii.f fVar = aVar.f16383c;
        mVar.getClass();
        c.f2305x1.getClass();
        b.b(fVar, null);
        this.f2309c = null;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f2308b;
            if (i >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((y) longSparseArray.valueAt(i)).b();
                i++;
            }
        }
    }
}
