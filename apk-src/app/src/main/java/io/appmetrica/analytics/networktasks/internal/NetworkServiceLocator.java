package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f25331b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkCore f25332a;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f25331b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            Intrinsics.g("instance");
            throw null;
        }

        public final void init(@NotNull IExecutionPolicy iExecutionPolicy) {
            if (NetworkServiceLocator.f25331b == null) {
                synchronized (NetworkServiceLocator.class) {
                    try {
                        if (NetworkServiceLocator.f25331b == null) {
                            NetworkServiceLocator.f25331b = new NetworkServiceLocator(iExecutionPolicy);
                        }
                        Unit unit = Unit.f27471a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        private Companion() {
        }

        public final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f25331b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator(@NotNull IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f25332a = networkCore;
    }

    @NotNull
    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init(@NotNull IExecutionPolicy iExecutionPolicy) {
        Companion.init(iExecutionPolicy);
    }

    @NotNull
    public final NetworkCore getNetworkCore() {
        return this.f25332a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f25332a.stopTasks();
    }

    public static final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }
}
