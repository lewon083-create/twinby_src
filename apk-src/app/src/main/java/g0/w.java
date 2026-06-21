package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface w extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f19783a = new g("camerax.core.camera.useCaseConfigFactory", a3.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f19784b = new g("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f19785c = new g("camerax.core.camera.SessionProcessor", i2.class, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f19786d = new g("camerax.core.camera.isPostviewSupported", Boolean.class, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f19787e = new g("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void p() {
        if (g(f19785c, null) != null) {
            throw new ClassCastException();
        }
    }
}
