package ih;

import he.e;
import ii.f;
import s7.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class b implements ei.b {
    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        f fVar = aVar.f16383c;
        v7.f fVar2 = new v7.f(23, aVar.f16381a);
        jh.c cVar = jh.c.f26627a;
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.initVarioqubWithAppMetricaAdapter", cVar, (Object) null).L(new e(17, fVar2));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.fetchConfig", cVar, (Object) null).L(new jf.a(fVar2, 14));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.activateConfig", cVar, (Object) null).L(new jf.a(fVar2, 15));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getString", cVar, (Object) null).L(new jf.a(fVar2, 16));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getBoolean", cVar, (Object) null).L(new jf.a(fVar2, 17));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getInt", cVar, (Object) null).L(new jf.a(fVar2, 18));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getDouble", cVar, (Object) null).L(new jf.a(fVar2, 19));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getId", cVar, (Object) null).L(new jf.a(fVar2, 20));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.putClientFeature", cVar, (Object) null).L(new jf.a(fVar2, 10));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.clearClientFeatures", cVar, (Object) null).L(new jf.a(fVar2, 11));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getAllKeys", cVar, (Object) null).L(new jf.a(fVar2, 12));
        new g(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.setDefaults", cVar, (Object) null).L(new jf.a(fVar2, 13));
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
    }
}
