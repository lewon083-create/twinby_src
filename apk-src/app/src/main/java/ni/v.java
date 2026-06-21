package ni;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29494c;

    public /* synthetic */ v(int i, Object obj) {
        this.f29493b = i;
        this.f29494c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ij.m mVar = (ij.m) obj;
        switch (this.f29493b) {
            case 0:
                Object obj2 = mVar.f21342b;
                if (obj2 instanceof ij.l) {
                    w.a("CaptureRequestOptions", this.f29494c, ij.m.a(obj2));
                }
                break;
            case 1:
                Object obj3 = mVar.f21342b;
                if (obj3 instanceof ij.l) {
                    w.a("Camera2CameraControl", this.f29494c, ij.m.a(obj3));
                }
                break;
            case 2:
                Object obj4 = mVar.f21342b;
                if (obj4 instanceof ij.l) {
                    w.a("SystemServicesManager", this.f29494c, ij.m.a(obj4));
                }
                break;
            case 3:
                Object obj5 = mVar.f21342b;
                if (obj5 instanceof ij.l) {
                    w.a("ResolutionFilter", this.f29494c, ij.m.a(obj5));
                }
                break;
            case 4:
                Object obj6 = mVar.f21342b;
                if (obj6 instanceof ij.l) {
                    w.a("CameraCharacteristicsKey", this.f29494c, ij.m.a(obj6));
                }
                break;
            case 5:
                Object obj7 = mVar.f21342b;
                if (obj7 instanceof ij.l) {
                    w.a("CameraCharacteristics", this.f29494c, ij.m.a(obj7));
                }
                break;
            case 6:
                Object obj8 = mVar.f21342b;
                if (obj8 instanceof ij.l) {
                    w.a("VideoRecordEventFinalize", this.f29494c, ij.m.a(obj8));
                }
                break;
            case 7:
                Object obj9 = mVar.f21342b;
                if (obj9 instanceof ij.l) {
                    w.a("Camera2CameraInfo", this.f29494c, ij.m.a(obj9));
                }
                break;
            case 8:
                Object obj10 = mVar.f21342b;
                if (obj10 instanceof ij.l) {
                    w.a("DisplayOrientedMeteringPointFactory", this.f29494c, ij.m.a(obj10));
                }
                break;
            case 9:
                Object obj11 = mVar.f21342b;
                if (obj11 instanceof ij.l) {
                    w.a("MeteringPointFactory", this.f29494c, ij.m.a(obj11));
                }
                break;
            case 10:
                Object obj12 = mVar.f21342b;
                if (obj12 instanceof ij.l) {
                    w.a("VideoRecordEvent", this.f29494c, ij.m.a(obj12));
                }
                break;
            case 11:
                Object obj13 = mVar.f21342b;
                if (obj13 instanceof ij.l) {
                    w.a("MeteringPoint", this.f29494c, ij.m.a(obj13));
                }
                break;
            case 12:
                Object obj14 = mVar.f21342b;
                if (obj14 instanceof ij.l) {
                    w.a("Observer", this.f29494c, ij.m.a(obj14));
                }
                break;
            case 13:
                Object obj15 = mVar.f21342b;
                if (obj15 instanceof ij.l) {
                    w.a("CameraPermissionsError", this.f29494c, ij.m.a(obj15));
                }
                break;
            case 14:
                Object obj16 = mVar.f21342b;
                if (obj16 instanceof ij.l) {
                    w.a("CameraInfo", this.f29494c, ij.m.a(obj16));
                }
                break;
            case 15:
                Object obj17 = mVar.f21342b;
                if (obj17 instanceof ij.l) {
                    w.a("CameraSelector", this.f29494c, ij.m.a(obj17));
                }
                break;
            case 16:
                Object obj18 = mVar.f21342b;
                if (obj18 instanceof ij.l) {
                    w.a("DeviceOrientationManager", this.f29494c, ij.m.a(obj18));
                }
                break;
            case 17:
                Object obj19 = mVar.f21342b;
                if (obj19 instanceof ij.l) {
                    w.a("Preview", this.f29494c, ij.m.a(obj19));
                }
                break;
            case 18:
                Object obj20 = mVar.f21342b;
                if (obj20 instanceof ij.l) {
                    w.a("VideoCapture", this.f29494c, ij.m.a(obj20));
                }
                break;
            case 19:
                Object obj21 = mVar.f21342b;
                if (obj21 instanceof ij.l) {
                    w.a("Recorder", this.f29494c, ij.m.a(obj21));
                }
                break;
            default:
                Object obj22 = mVar.f21342b;
                if (obj22 instanceof ij.l) {
                    w.a("VideoOutput", this.f29494c, ij.m.a(obj22));
                }
                break;
        }
        return Unit.f27471a;
    }
}
