package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC0137ej;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C0154fa;
import io.appmetrica.analytics.impl.C0159ff;
import io.appmetrica.analytics.impl.C0185gf;
import io.appmetrica.analytics.impl.C0425q3;
import io.appmetrica.analytics.impl.C0449r3;
import io.appmetrica.analytics.impl.C5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25139a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UriMatcher f25140b = new UriMatcher(-1);

    private void a(C5 c52, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = c52.f22190a.invoke(contentValues);
                if (objInvoke != null) {
                    c52.f22192c.b(applicationContext);
                    if (((Boolean) c52.f22191b.invoke(objInvoke)).booleanValue()) {
                        AbstractC0137ej.a("Successfully saved " + c52.f22193d, new Object[0]);
                    } else {
                        AbstractC0137ej.a("Did not save " + c52.f22193d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th2), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        AbstractC0137ej.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f25139a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f25139a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f25140b.match(uri);
                    if (iMatch == 1) {
                        a(new C5(new C0159ff(), new C0185gf(), C0154fa.f23871d, "preload info"), contentValues);
                    } else if (iMatch != 2) {
                        AbstractC0137ej.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new C5(new C0425q3(), new C0449r3(), C0154fa.f23871d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = B5.f22126a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String strX = om1.x(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f25140b.addURI(strX, "preloadinfo", 1);
        this.f25140b.addURI(strX, "clids", 2);
        B5.f22126a = new CountDownLatch(1);
        B5.f22127b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0137ej.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0137ej.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
