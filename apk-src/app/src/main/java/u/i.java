package u;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.d f33962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33963c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f33961a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bb.e f33964d = null;

    public i(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33962b = new h(cameraCharacteristics);
        } else {
            this.f33962b = new m4.d(cameraCharacteristics);
        }
        this.f33963c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f33962b.f28630b).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f33961a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f33962b.f28630b).get(key);
                if (obj2 != null) {
                    this.f33961a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b() {
        Integer num = (!d() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final bb.e c() {
        if (this.f33964d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f33964d = new bb.e(streamConfigurationMap, new r3.b(this.f33963c));
            } catch (AssertionError | NullPointerException e3) {
                throw new IllegalArgumentException(e3.getMessage());
            }
        }
        return this.f33964d;
    }

    public final boolean d() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }
}
