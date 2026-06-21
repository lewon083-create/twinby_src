package com.vk.sdk.api.discover.dto;

import gf.a;
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
public final class DiscoverCarouselButton {

    @b("action")
    @NotNull
    private final DiscoverCarouselButtonAction action;

    @b("style")
    @Nullable
    private final DiscoverCarouselButtonType style;

    @b("title")
    @NotNull
    private final String title;

    public DiscoverCarouselButton(@NotNull DiscoverCarouselButtonAction action, @NotNull String title, @Nullable DiscoverCarouselButtonType discoverCarouselButtonType) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        this.action = action;
        this.title = title;
        this.style = discoverCarouselButtonType;
    }

    public static /* synthetic */ DiscoverCarouselButton copy$default(DiscoverCarouselButton discoverCarouselButton, DiscoverCarouselButtonAction discoverCarouselButtonAction, String str, DiscoverCarouselButtonType discoverCarouselButtonType, int i, Object obj) {
        if ((i & 1) != 0) {
            discoverCarouselButtonAction = discoverCarouselButton.action;
        }
        if ((i & 2) != 0) {
            str = discoverCarouselButton.title;
        }
        if ((i & 4) != 0) {
            discoverCarouselButtonType = discoverCarouselButton.style;
        }
        return discoverCarouselButton.copy(discoverCarouselButtonAction, str, discoverCarouselButtonType);
    }

    @NotNull
    public final DiscoverCarouselButtonAction component1() {
        return this.action;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final DiscoverCarouselButtonType component3() {
        return this.style;
    }

    @NotNull
    public final DiscoverCarouselButton copy(@NotNull DiscoverCarouselButtonAction action, @NotNull String title, @Nullable DiscoverCarouselButtonType discoverCarouselButtonType) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        return new DiscoverCarouselButton(action, title, discoverCarouselButtonType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButton)) {
            return false;
        }
        DiscoverCarouselButton discoverCarouselButton = (DiscoverCarouselButton) obj;
        return Intrinsics.a(this.action, discoverCarouselButton.action) && Intrinsics.a(this.title, discoverCarouselButton.title) && this.style == discoverCarouselButton.style;
    }

    @NotNull
    public final DiscoverCarouselButtonAction getAction() {
        return this.action;
    }

    @Nullable
    public final DiscoverCarouselButtonType getStyle() {
        return this.style;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = a.e(this.action.hashCode() * 31, 31, this.title);
        DiscoverCarouselButtonType discoverCarouselButtonType = this.style;
        return iE + (discoverCarouselButtonType == null ? 0 : discoverCarouselButtonType.hashCode());
    }

    @NotNull
    public String toString() {
        return "DiscoverCarouselButton(action=" + this.action + ", title=" + this.title + ", style=" + this.style + ")";
    }

    public /* synthetic */ DiscoverCarouselButton(DiscoverCarouselButtonAction discoverCarouselButtonAction, String str, DiscoverCarouselButtonType discoverCarouselButtonType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(discoverCarouselButtonAction, str, (i & 4) != 0 ? null : discoverCarouselButtonType);
    }
}
