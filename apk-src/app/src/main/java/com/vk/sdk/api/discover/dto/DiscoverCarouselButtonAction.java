package com.vk.sdk.api.discover.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class DiscoverCarouselButtonAction {

    @b("context")
    @Nullable
    private final DiscoverCarouselButtonContext context;

    @b("target")
    @Nullable
    private final DiscoverCarouselButtonActionTarget target;

    @b("type")
    @NotNull
    private final DiscoverCarouselButtonActionType type;

    @b("url")
    @Nullable
    private final String url;

    public DiscoverCarouselButtonAction(@NotNull DiscoverCarouselButtonActionType type, @Nullable DiscoverCarouselButtonContext discoverCarouselButtonContext, @Nullable DiscoverCarouselButtonActionTarget discoverCarouselButtonActionTarget, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.context = discoverCarouselButtonContext;
        this.target = discoverCarouselButtonActionTarget;
        this.url = str;
    }

    public static /* synthetic */ DiscoverCarouselButtonAction copy$default(DiscoverCarouselButtonAction discoverCarouselButtonAction, DiscoverCarouselButtonActionType discoverCarouselButtonActionType, DiscoverCarouselButtonContext discoverCarouselButtonContext, DiscoverCarouselButtonActionTarget discoverCarouselButtonActionTarget, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            discoverCarouselButtonActionType = discoverCarouselButtonAction.type;
        }
        if ((i & 2) != 0) {
            discoverCarouselButtonContext = discoverCarouselButtonAction.context;
        }
        if ((i & 4) != 0) {
            discoverCarouselButtonActionTarget = discoverCarouselButtonAction.target;
        }
        if ((i & 8) != 0) {
            str = discoverCarouselButtonAction.url;
        }
        return discoverCarouselButtonAction.copy(discoverCarouselButtonActionType, discoverCarouselButtonContext, discoverCarouselButtonActionTarget, str);
    }

    @NotNull
    public final DiscoverCarouselButtonActionType component1() {
        return this.type;
    }

    @Nullable
    public final DiscoverCarouselButtonContext component2() {
        return this.context;
    }

    @Nullable
    public final DiscoverCarouselButtonActionTarget component3() {
        return this.target;
    }

    @Nullable
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final DiscoverCarouselButtonAction copy(@NotNull DiscoverCarouselButtonActionType type, @Nullable DiscoverCarouselButtonContext discoverCarouselButtonContext, @Nullable DiscoverCarouselButtonActionTarget discoverCarouselButtonActionTarget, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new DiscoverCarouselButtonAction(type, discoverCarouselButtonContext, discoverCarouselButtonActionTarget, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonAction)) {
            return false;
        }
        DiscoverCarouselButtonAction discoverCarouselButtonAction = (DiscoverCarouselButtonAction) obj;
        return this.type == discoverCarouselButtonAction.type && Intrinsics.a(this.context, discoverCarouselButtonAction.context) && this.target == discoverCarouselButtonAction.target && Intrinsics.a(this.url, discoverCarouselButtonAction.url);
    }

    @Nullable
    public final DiscoverCarouselButtonContext getContext() {
        return this.context;
    }

    @Nullable
    public final DiscoverCarouselButtonActionTarget getTarget() {
        return this.target;
    }

    @NotNull
    public final DiscoverCarouselButtonActionType getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        DiscoverCarouselButtonContext discoverCarouselButtonContext = this.context;
        int iHashCode2 = (iHashCode + (discoverCarouselButtonContext == null ? 0 : discoverCarouselButtonContext.hashCode())) * 31;
        DiscoverCarouselButtonActionTarget discoverCarouselButtonActionTarget = this.target;
        int iHashCode3 = (iHashCode2 + (discoverCarouselButtonActionTarget == null ? 0 : discoverCarouselButtonActionTarget.hashCode())) * 31;
        String str = this.url;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DiscoverCarouselButtonAction(type=" + this.type + ", context=" + this.context + ", target=" + this.target + ", url=" + this.url + ")";
    }

    public /* synthetic */ DiscoverCarouselButtonAction(DiscoverCarouselButtonActionType discoverCarouselButtonActionType, DiscoverCarouselButtonContext discoverCarouselButtonContext, DiscoverCarouselButtonActionTarget discoverCarouselButtonActionTarget, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(discoverCarouselButtonActionType, (i & 2) != 0 ? null : discoverCarouselButtonContext, (i & 4) != 0 ? null : discoverCarouselButtonActionTarget, (i & 8) != 0 ? null : str);
    }
}
