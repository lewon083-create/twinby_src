package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FileObserverC0150f6 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f23831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f23832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0051ba f23833c;

    public FileObserverC0150f6(File file, C0202h6 c0202h6, C0051ba c0051ba) {
        super(file.getAbsolutePath(), 8);
        this.f23831a = c0202h6;
        this.f23832b = file;
        this.f23833c = c0051ba;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f23831a;
        C0051ba c0051ba = this.f23833c;
        File file = this.f23832b;
        c0051ba.getClass();
        consumer.consume(new File(file, str));
    }
}
