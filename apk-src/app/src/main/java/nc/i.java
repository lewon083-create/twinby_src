package nc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ya.e {
    @Override // ya.e
    public final void j(t tVar, float f10, float f11) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        p pVar = new p(0.0f, 0.0f, f12, f12);
        pVar.f29281f = 180.0f;
        pVar.f29282g = 90.0f;
        tVar.f29293f.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f29294g.add(nVar);
        tVar.f29291d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        tVar.f29289b = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        tVar.f29290c = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}
