package j3;

import android.media.AudioAttributes;
import android.os.Build;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f26224c = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioAttributes f26226b;

    static {
        gf.a.o(0, 1, 2, 3, 4);
        m3.z.G(5);
        m3.z.G(6);
    }

    public d(int i) {
        this.f26225a = i;
    }

    public final AudioAttributes a() {
        if (this.f26226b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f26225a).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f26226b = usage.build();
        }
        return this.f26226b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d.class == obj.getClass() && this.f26225a == ((d) obj).f26225a;
    }

    public final int hashCode() {
        return ((((((527 + this.f26225a) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + 1) * 31) + 1) * 29791) + 1;
    }
}
