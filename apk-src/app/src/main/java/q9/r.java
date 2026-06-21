package q9;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.go;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f31959g = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.d f31960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f31961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.a f31963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f31964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f31965f;

    public r() {
        u9.d dVar = new u9.d();
        dVar.f34379a = -1.0f;
        o oVar = new o(new go("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new go("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new go("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new go("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new go("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new go("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5));
        u9.a aVar = new u9.a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        this.f31960a = dVar;
        this.f31961b = oVar;
        this.f31962c = false;
        this.f31963d = aVar;
        this.f31964e = random;
        this.f31965f = string;
    }

    public static void a() {
        f31959g.f31962c = false;
    }
}
