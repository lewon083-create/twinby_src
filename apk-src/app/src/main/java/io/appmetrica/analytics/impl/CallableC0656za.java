package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC0656za implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Aa f25114a;

    public CallableC0656za(Aa aa2) {
        this.f25114a = aa2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f25114a.f22061a.getContentResolver();
        Aa aa2 = this.f25114a;
        aa2.f22062b = contentResolver.query(uri, null, null, new String[]{aa2.f22061a.getPackageName()}, null);
        Cursor cursor = this.f25114a.f22062b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f25114a.f22062b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C0338mg(string, this.f25114a.f22062b.getLong(1), this.f25114a.f22062b.getLong(2), EnumC0313lg.f24303d);
    }
}
