package nc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ya.e {
    @Override // ya.e
    public final void j(t tVar, float f10, float f11) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        double d10 = f11;
        double d11 = f10;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
