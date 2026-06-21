package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0077ca implements Ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23581b;

    public C0077ca(@NotNull Context context, @NotNull String str) {
        this.f23580a = context;
        this.f23581b = str;
    }

    @Override // io.appmetrica.analytics.impl.Ao
    @Nullable
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f23580a, this.f23581b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f23580a, this.f23581b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return tj.k.b(fileFromSdkStorage);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ao
    public final void a(@NotNull String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f23580a, this.f23581b);
            if (fileFromSdkStorage != null) {
                tj.k.c(fileFromSdkStorage, str);
            }
        } catch (Throwable unused) {
        }
    }
}
