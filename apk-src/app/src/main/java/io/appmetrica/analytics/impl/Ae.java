package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no f22069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oo f22070c;

    public Ae(Context context) {
        this(context, new no(), new oo());
    }

    public final String a(String str) {
        try {
            this.f22070c.getClass();
            if (!oo.a(str)) {
                this.f22069b.getClass();
                str = kotlin.text.a0.l(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f22068a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Ka.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ae(Context context, no noVar, oo ooVar) {
        this.f22068a = context;
        this.f22069b = noVar;
        this.f22070c = ooVar;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f22068a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f22068a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
