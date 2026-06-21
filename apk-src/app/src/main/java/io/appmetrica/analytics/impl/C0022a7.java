package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0022a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f23409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23411c;

    public C0022a7(J6 j62, ArrayList arrayList, boolean z5) {
        this.f23409a = j62;
        this.f23410b = arrayList;
        this.f23411c = z5;
    }

    public final String a(Context context, Y6 y62) {
        File parentFile;
        try {
            File fileA = this.f23409a.a(context, y62.b());
            if (!fileA.exists() && (parentFile = fileA.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, y62.a(), fileA);
            }
            return fileA.getPath();
        } catch (Throwable unused) {
            return y62.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f23410b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileA = ((J6) it.next()).a(context, str);
            if (fileA.exists()) {
                try {
                    if (this.f23411c) {
                        FileUtils.copyToNullable(fileA, file);
                    } else {
                        FileUtils.move(fileA, file);
                    }
                    String path = fileA.getPath();
                    String path2 = file.getPath();
                    for (String str2 : kotlin.collections.s.f("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f23411c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
