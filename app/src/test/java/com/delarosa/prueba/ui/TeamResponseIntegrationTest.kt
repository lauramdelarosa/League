package com.delarosa.prueba.ui

import org.junit.runner.RunWith
import org.koin.test.AutoCloseKoinTest
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TeamResponseIntegrationTest : AutoCloseKoinTest() {
    /* @get:Rule
     val rule = InstantTaskExecutorRule()

     @Mock
     lateinit var observerModel: Observer<IceCreamViewModel.UiModel>

     private lateinit var vm: IceCreamViewModel

     @Before
     fun setUp() {
         val vmModule = module {
             factory { IceCreamViewModel(get(), get()) }
             factory { GetTeams(get()) }
         }
         initMockedDi(vmModule)
         vm = get()
     }

     @Test
     fun `ice cream data is loaded from server`() {
         vm.model.observeForever(observerModel)
         verify(observerModel).onChanged(IceCreamViewModel.UiModel.Content(fakeListIceCream))
     }*/
}