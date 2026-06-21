package io.appmetrica.analytics.flutter.utils;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommerceConverter {
    private static final String ADD_CART_ITEM_EVENT = "add_cart_item_event";
    private static final String BEGIN_CHECKOUT_EVENT = "begin_checkout_event";
    private static final String PURCHASE_EVENT = "purchase_event";
    private static final String REMOVE_CART_ITEM_EVENT = "remove_cart_item_event";
    private static final String SHOW_PRODUCT_CARD_EVENT = "show_product_card_event";
    private static final String SHOW_PRODUCT_DETAILS_EVENT = "show_product_details_event";
    private static final String SHOW_SCREEN_EVENT = "show_screen_event";

    public static ECommerceEvent toNative(@NonNull Pigeon.ECommerceEventPigeon eCommerceEventPigeon) {
        String eventType = eCommerceEventPigeon.getEventType();
        eventType.getClass();
        switch (eventType) {
            case "begin_checkout_event":
                Pigeon.ECommerceOrderPigeon order = eCommerceEventPigeon.getOrder();
                if (order != null) {
                    return ECommerceEvent.beginCheckoutEvent(toNative(order));
                }
                return null;
            case "remove_cart_item_event":
                Pigeon.ECommerceCartItemPigeon cartItem = eCommerceEventPigeon.getCartItem();
                if (cartItem != null) {
                    return ECommerceEvent.removeCartItemEvent(toNative(cartItem));
                }
                return null;
            case "show_product_card_event":
                Pigeon.ECommerceProductPigeon product = eCommerceEventPigeon.getProduct();
                Pigeon.ECommerceScreenPigeon screen = eCommerceEventPigeon.getScreen();
                if (product == null || screen == null) {
                    return null;
                }
                return ECommerceEvent.showProductCardEvent(toNative(product), toNative(screen));
            case "show_product_details_event":
                Pigeon.ECommerceProductPigeon product2 = eCommerceEventPigeon.getProduct();
                Pigeon.ECommerceReferrerPigeon referrer = eCommerceEventPigeon.getReferrer();
                ECommerceReferrer eCommerceReferrer = referrer != null ? toNative(referrer) : null;
                if (product2 != null) {
                    return ECommerceEvent.showProductDetailsEvent(toNative(product2), eCommerceReferrer);
                }
                return null;
            case "add_cart_item_event":
                Pigeon.ECommerceCartItemPigeon cartItem2 = eCommerceEventPigeon.getCartItem();
                if (cartItem2 != null) {
                    return ECommerceEvent.addCartItemEvent(toNative(cartItem2));
                }
                return null;
            case "show_screen_event":
                Pigeon.ECommerceScreenPigeon screen2 = eCommerceEventPigeon.getScreen();
                if (screen2 != null) {
                    return ECommerceEvent.showScreenEvent(toNative(screen2));
                }
                return null;
            case "purchase_event":
                Pigeon.ECommerceOrderPigeon order2 = eCommerceEventPigeon.getOrder();
                if (order2 != null) {
                    return ECommerceEvent.purchaseEvent(toNative(order2));
                }
                return null;
            default:
                return null;
        }
    }

    @NonNull
    private static ECommerceScreen toNative(@NonNull Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon) {
        ECommerceScreen eCommerceScreen = new ECommerceScreen();
        eCommerceScreen.setName(eCommerceScreenPigeon.getName());
        eCommerceScreen.setSearchQuery(eCommerceScreenPigeon.getSearchQuery());
        eCommerceScreen.setCategoriesPath(eCommerceScreenPigeon.getCategoriesPath());
        eCommerceScreen.setPayload(eCommerceScreenPigeon.getPayload());
        return eCommerceScreen;
    }

    @NonNull
    private static ECommerceProduct toNative(@NonNull Pigeon.ECommerceProductPigeon eCommerceProductPigeon) {
        ECommerceProduct eCommerceProduct = new ECommerceProduct(eCommerceProductPigeon.getSku());
        eCommerceProduct.setName(eCommerceProductPigeon.getName());
        eCommerceProduct.setCategoriesPath(eCommerceProductPigeon.getCategoriesPath());
        eCommerceProduct.setPayload(eCommerceProductPigeon.getPayload());
        Pigeon.ECommercePricePigeon actualPrice = eCommerceProductPigeon.getActualPrice();
        eCommerceProduct.setActualPrice(actualPrice != null ? toNative(actualPrice) : null);
        Pigeon.ECommercePricePigeon originalPrice = eCommerceProductPigeon.getOriginalPrice();
        eCommerceProduct.setOriginalPrice(originalPrice != null ? toNative(originalPrice) : null);
        eCommerceProduct.setPromocodes(eCommerceProductPigeon.getPromocodes());
        return eCommerceProduct;
    }

    @NonNull
    private static ECommerceAmount toNative(@NonNull Pigeon.ECommerceAmountPigeon eCommerceAmountPigeon) {
        return new ECommerceAmount(new BigDecimal(eCommerceAmountPigeon.getAmount()), eCommerceAmountPigeon.getCurrency());
    }

    @NonNull
    private static ECommercePrice toNative(@NonNull Pigeon.ECommercePricePigeon eCommercePricePigeon) {
        ECommercePrice eCommercePrice = new ECommercePrice(toNative(eCommercePricePigeon.getFiat()));
        List<Pigeon.ECommerceAmountPigeon> internalComponents = eCommercePricePigeon.getInternalComponents();
        if (internalComponents != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Pigeon.ECommerceAmountPigeon> it = internalComponents.iterator();
            while (it.hasNext()) {
                arrayList.add(toNative(it.next()));
            }
            eCommercePrice.setInternalComponents(arrayList);
        }
        return eCommercePrice;
    }

    @NonNull
    private static ECommerceReferrer toNative(@NonNull Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon) {
        ECommerceReferrer eCommerceReferrer = new ECommerceReferrer();
        eCommerceReferrer.setType(eCommerceReferrerPigeon.getType());
        eCommerceReferrer.setIdentifier(eCommerceReferrerPigeon.getIdentifier());
        Pigeon.ECommerceScreenPigeon screen = eCommerceReferrerPigeon.getScreen();
        eCommerceReferrer.setScreen(screen != null ? toNative(screen) : null);
        return eCommerceReferrer;
    }

    @NonNull
    private static ECommerceCartItem toNative(@NonNull Pigeon.ECommerceCartItemPigeon eCommerceCartItemPigeon) {
        ECommerceCartItem eCommerceCartItem = new ECommerceCartItem(toNative(eCommerceCartItemPigeon.getProduct()), toNative(eCommerceCartItemPigeon.getRevenue()), new BigDecimal(eCommerceCartItemPigeon.getQuantity()));
        Pigeon.ECommerceReferrerPigeon referrer = eCommerceCartItemPigeon.getReferrer();
        eCommerceCartItem.setReferrer(referrer != null ? toNative(referrer) : null);
        return eCommerceCartItem;
    }

    @NonNull
    private static ECommerceOrder toNative(@NonNull Pigeon.ECommerceOrderPigeon eCommerceOrderPigeon) {
        ArrayList arrayList = new ArrayList();
        Iterator<Pigeon.ECommerceCartItemPigeon> it = eCommerceOrderPigeon.getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(toNative(it.next()));
        }
        ECommerceOrder eCommerceOrder = new ECommerceOrder(eCommerceOrderPigeon.getIdentifier(), arrayList);
        eCommerceOrder.setPayload(eCommerceOrderPigeon.getPayload());
        return eCommerceOrder;
    }
}
