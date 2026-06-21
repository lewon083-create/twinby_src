package com.vk.sdk.api.groups.dto;

import kotlin.Metadata;

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
public enum GroupsGroupFullSection {
    NONE(0),
    PHOTOS(1),
    TOPICS(2),
    AUDIOS(3),
    VIDEOS(4),
    MARKET(5),
    STORIES(6),
    APPS(7),
    FOLLOWERS(8),
    LINKS(9),
    EVENTS(10),
    PLACES(11),
    CONTACTS(12),
    APP_BTNS(13),
    DOCS(14),
    EVENT_COUNTERS(15),
    GROUP_MESSAGES(16),
    ALBUMS(24),
    CATEGORIES(26),
    ADMIN_HELP(27),
    APP_WIDGET(31),
    PUBLIC_HELP(32),
    HS_DONATION_APP(33),
    HS_MARKET_APP(34),
    ADDRESSES(35),
    ARTIST_PAGE(36),
    PODCAST(37),
    ARTICLES(39),
    ADMIN_TIPS(40),
    MENU(41),
    FIXED_POST(42),
    CHATS(43),
    EVERGREEN_NOTICE(44),
    MUSICIANS(45),
    NARRATIVES(46),
    DONUT_DONATE(47),
    CLIPS(48),
    MARKET_CART(49),
    CURATORS(50),
    MARKET_SERVICES(51),
    CLASSIFIEDS(53),
    TEXTLIVES(54),
    DONUT_FOR_DONS(55),
    BADGES(57),
    CHATS_CREATION(58);

    private final int value;

    GroupsGroupFullSection(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
