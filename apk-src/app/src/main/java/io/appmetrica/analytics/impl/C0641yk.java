package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0641yk implements ServiceStorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0517tl f25102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f25103c;

    public C0641yk(@NotNull Context context, @NotNull InterfaceC0517tl interfaceC0517tl, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        this.f25101a = context;
        this.f25102b = interfaceC0517tl;
        this.f25103c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(@NotNull String str, @NotNull ProtobufStateSerializer<P> protobufStateSerializer, @NotNull ProtobufConverter<T, P> protobufConverter) {
        Nm.f22760a.getClass();
        return new Mm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f25101a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f25101a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final SQLiteOpenHelper getDbStorage() {
        return this.f25103c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f25101a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final TempCacheStorage getTempCacheStorage() {
        C0494sn c0494sn;
        C0616xk c0616xkB = C0382oa.I.B();
        Context context = this.f25101a;
        synchronized (c0616xkB) {
            try {
                c0494sn = c0616xkB.f25038h;
                if (c0494sn == null) {
                    Rm rm = Rm.SERVICE;
                    C0469rn c0469rn = c0616xkB.f25037g;
                    if (c0469rn == null) {
                        c0469rn = new C0469rn(new C0418pl(c0616xkB.f(context)), "temp_cache");
                        c0616xkB.f25037g = c0469rn;
                    }
                    c0494sn = new C0494sn(context, rm, c0469rn);
                    c0616xkB.f25038h = c0494sn;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0494sn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences legacyModulePreferences() {
        return new Ab(this.f25102b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new Xc(str, this.f25102b);
    }
}
