package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f25459d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f25460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f25461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C0680k f25462c;

    public Z(ClientContext clientContext, C0687s c0687s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f25460a = clientContext;
        this.f25461b = c0687s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5, Uri uri) {
        C0680k c0680k;
        super.onChange(z5, uri);
        if (!kotlin.text.a0.n(String.valueOf(uri), f25459d, false) || (c0680k = this.f25462c) == null) {
            return;
        }
        try {
            String[] strArr = {"date_added"};
            List elements = c0680k.f25490b;
            Intrinsics.checkNotNullParameter(strArr, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = 1;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, elements.size() + 1);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                objArrCopyOf[i] = it.next();
                i++;
            }
            Intrinsics.b(objArrCopyOf);
            String[] strArr2 = (String[]) objArrCopyOf;
            Cursor cursorQuery = this.f25460a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr2, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c0680k.f25491c)}, "date_added DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        for (String str : strArr2) {
                        }
                        Iterator it2 = c0680k.f25490b.iterator();
                        while (it2.hasNext()) {
                            if (StringsKt.y(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot", false)) {
                                this.f25461b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            Unit unit = Unit.f27471a;
            hl.l.g(cursorQuery, null);
        } catch (Exception unused) {
        }
    }
}
