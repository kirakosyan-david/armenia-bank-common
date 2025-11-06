package am.armeniabank.armeniabankcommon.contract;

import am.armeniabank.armeniabankcommon.constants.ApiConstants;
import am.armeniabank.armeniabankcommon.request.WalletOperationRequest;
import am.armeniabank.armeniabankcommon.response.WalletResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.UUID;


@Tag(name = "Wallet API", description = "API for managing wallet balances")
@FeignClient(name = "wallet-service", url = "${wallet-service.url}")
@Validated
public interface WalletApi {

    @Operation(
            summary = "Freeze funds in wallet",
            description = "Blocks a specified amount in the user's wallet"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funds frozen successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid wallet ID or amount"),
            @ApiResponse(responseCode = "404", description = "Wallet not found")
    })
    @PutMapping(ApiConstants.WALLET_SERVICE_OPERATION_WALLET_ID_FREEZE_URL)
    void freezeWallet(@PathVariable("walletId") UUID walletId,
                      @Valid @RequestBody WalletOperationRequest reason,
                      @RequestHeader("Authorization") String token);

    @Operation(
            summary = "Unfreeze funds in wallet",
            description = "Blocks a specified amount in the user's wallet"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funds unfrozen successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid wallet ID or amount"),
            @ApiResponse(responseCode = "404", description = "Wallet not found")
    })
    @PutMapping(ApiConstants.WALLET_SERVICE_OPERATION_WALLET_ID_UNFREEZE_URL)
    void unfreezeWallet(@PathVariable("walletId") UUID walletId,
                      @Valid @RequestBody WalletOperationRequest reason,
                      @RequestHeader("Authorization") String token);

    @Operation(summary = "Debit funds from wallet")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funds debited successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid wallet ID or amount"),
            @ApiResponse(responseCode = "404", description = "Wallet not found")
    })
    @PutMapping(ApiConstants.WALLET_SERVICE_OPERATION_WALLET_ID_DEBIT_URL)
    void debitWallet(@PathVariable("walletId") UUID walletId,
                     @Valid @RequestBody WalletOperationRequest reason,
                     @RequestHeader("Authorization") String token);

    @Operation(summary = "Credit funds to wallet")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funds credited successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid wallet ID or amount"),
            @ApiResponse(responseCode = "404", description = "Wallet not found")
    })
    @PutMapping(ApiConstants.WALLET_SERVICE_OPERATION_WALLET_ID_CREDIT_URL)
    void creditWallet(@PathVariable("walletId") UUID walletId,
                      @Valid @RequestBody WalletOperationRequest reason,
                      @RequestHeader("Authorization") String token);

    @Operation(summary = "Get wallet info")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Wallet info retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Wallet not found")
    })
    @GetMapping(ApiConstants.WALLET_SERVICE_WALLET_ID_URL)
    WalletResponse getWalletInfo(@PathVariable("walletId") UUID walletId,
                                 @RequestHeader("Authorization") String token);
}
