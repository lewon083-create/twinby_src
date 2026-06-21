package yads;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud f37583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz0 f37584b;

    public /* synthetic */ d01() {
        this(new ud(), new yz0());
    }

    public final td a(zz0 zz0Var) {
        try {
            IBinder iBinder = (IBinder) zz0Var.f45599a.poll(5L, TimeUnit.SECONDS);
            if (iBinder == null) {
                return null;
            }
            this.f37584b.getClass();
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            ce gmsServiceAdvertisingInfoReader = iInterfaceQueryLocalInterface instanceof ce ? (ce) iInterfaceQueryLocalInterface : null;
            if (gmsServiceAdvertisingInfoReader == null) {
                gmsServiceAdvertisingInfoReader = new GmsServiceAdvertisingInfoReader(iBinder);
            }
            String advertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
            Boolean adTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
            this.f37583a.getClass();
            if (adTrackingLimited == null || advertisingId == null) {
                return null;
            }
            return new td(advertisingId, adTrackingLimited.booleanValue());
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public d01(ud udVar, yz0 yz0Var) {
        this.f37583a = udVar;
        this.f37584b = yz0Var;
    }
}
