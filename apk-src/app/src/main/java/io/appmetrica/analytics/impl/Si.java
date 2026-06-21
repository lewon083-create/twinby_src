package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Si implements Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22970b = "content://" + a() + "/clids";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22971c = "clid_key";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22972d = "clid_value";

    public Si(@NotNull Context context) {
        this.f22969a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ti, kotlin.jvm.functions.Function0
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0474s3 invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        if (!PackageManagerUtils.hasContentProvider(this.f22969a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0137ej.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f22969a.getContentResolver().query(Uri.parse(this.f22970b), null, null, null, null);
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids\n" + StringUtils.throwableToString(th), new Object[0]);
                } finally {
                    ko.a(cursorQuery);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            AbstractC0137ej.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            try {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f22971c));
                string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f22972d));
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                AbstractC0137ej.a("Invalid clid {%s : %s}", string, string2);
            } else {
                linkedHashMap.put(string, string2);
            }
        }
        AbstractC0137ej.a("Clids from satellite: %s", linkedHashMap);
        return new C0474s3(linkedHashMap, T7.f23006d);
    }
}
