package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import ma.g;
import ma.h;
import ma.i;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2528a = 0;
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    ma.a zza;
    ab.d zzb;
    boolean zzc;
    final Object zzd;
    b zze;
    final long zzf;
    private final Context zzi;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z5) {
            this.zza = str;
            this.zzb = z5;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws Throwable {
        AdvertisingIdClient advertisingIdClient;
        AdvertisingIdClient advertisingIdClient2 = zzh;
        if (advertisingIdClient2 == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient2 = zzh;
                    if (advertisingIdClient2 == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        advertisingIdClient2 = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient2;
                    }
                } finally {
                }
            }
        }
        AdvertisingIdClient advertisingIdClient3 = advertisingIdClient2;
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (d.f2536c == null) {
            synchronized (d.f2537d) {
                try {
                    if (d.f2536c == null) {
                        d.f2536c = new d(context);
                    }
                } finally {
                }
            }
        }
        d dVar = d.f2536c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = -1;
        try {
            Info infoZzf = advertisingIdClient3.zzf(-1);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            advertisingIdClient3.zze(infoZzf, true, 0.0f, jElapsedRealtime2, "", null);
            advertisingIdClient = advertisingIdClient3;
            try {
                try {
                    dVar.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jElapsedRealtime, System.currentTimeMillis());
                    Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + "ms");
                    return infoZzf;
                } catch (Throwable th2) {
                    th = th2;
                    jElapsedRealtime = jElapsedRealtime;
                    Throwable th3 = th;
                    advertisingIdClient.zze(null, true, 0.0f, -1L, "", th3);
                    if (th3 instanceof IOException) {
                        i = 1;
                    } else if (th3 instanceof h) {
                        i = 9;
                    } else if (th3 instanceof i) {
                        i = 16;
                    } else if (th3 instanceof IllegalStateException) {
                        i = 8;
                    }
                    dVar.a(i, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jElapsedRealtime, System.currentTimeMillis());
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            advertisingIdClient = advertisingIdClient3;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean z5;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            c0.h("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                c0.i(advertisingIdClient.zza);
                c0.i(advertisingIdClient.zzb);
                try {
                    ab.b bVar = (ab.b) advertisingIdClient.zzb;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelC0 = bVar.c0(parcelObtain, 6);
                    int i = ab.a.f729a;
                    z5 = parcelC0.readInt() != 0;
                    parcelC0.recycle();
                } catch (RemoteException e3) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                    throw new IOException("Remote exception", e3);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return z5;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    private final Info zzf(int i) {
        Info info;
        c0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            c0.i(this.zza);
            c0.i(this.zzb);
            try {
                ab.b bVar = (ab.b) this.zzb;
                bVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z5 = true;
                Parcel parcelC0 = bVar.c0(parcelObtain, 1);
                String string = parcelC0.readString();
                parcelC0.recycle();
                ab.b bVar2 = (ab.b) this.zzb;
                bVar2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i10 = ab.a.f729a;
                parcelObtain2.writeInt(1);
                Parcel parcelC02 = bVar2.c0(parcelObtain2, 2);
                if (parcelC02.readInt() == 0) {
                    z5 = false;
                }
                parcelC02.recycle();
                info = new Info(string, z5);
            } catch (RemoteException e3) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                throw new IOException("Remote exception", e3);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return zzf(-1);
    }

    public void start() {
        zzc(true);
    }

    public final void zza() {
        c0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ta.a.b().c(this.zzi, this.zza);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            b bVar = this.zze;
            if (bVar != null) {
                bVar.f2532d.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.zzf;
            if (j10 > 0) {
                this.zze = new b(this, j10);
            }
        }
    }

    public final void zzc(boolean z5) {
        IOException iOException;
        c0.h("Calling this from your main thread can lead to deadlock");
        if (z5) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = g.f28775b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ma.a aVar = new ma.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ta.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = aVar;
                        try {
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder iBinderB = aVar.b();
                                int i = ab.c.f731b;
                                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                this.zzb = iInterfaceQueryLocalInterface instanceof ab.d ? (ab.d) iInterfaceQueryLocalInterface : new ab.b(iBinderB);
                                this.zzc = true;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzc) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    zzc(false);
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
        } finally {
        }
    }

    public final boolean zze(Info info, boolean z5, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            String id2 = info.getId();
            if (id2 != null) {
                map.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            map.put("error", th2.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new a(map).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j10, boolean z5, boolean z10) {
        this.zzd = new Object();
        c0.i(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j10;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z5) {
    }
}
